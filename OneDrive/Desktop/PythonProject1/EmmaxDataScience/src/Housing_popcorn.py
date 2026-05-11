import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import sklearn as slk
from sklearn.pipeline import make_pipeline
from sklearn.preprocessing import StandardScaler,OneHotEncoder, FunctionTransformer
from sklearn.compose import ColumnTransformer, make_column_selector
from sklearn.impute import SimpleImputer
from sklearn.model_selection import train_test_split, cross_val_score
from sklearn.linear_model import LinearRegression
from sklearn.metrics import root_mean_squared_error
from sklearn.ensemble import RandomForestRegressor
import joblib


def read_csv():
    housing = pd.read_csv(r"\Users\DELL\OneDrive\Desktop\MATERIALS FOR CODING\housing.csv\housing.csv")
    return housing


def view_info(housing):
    print(housing.info())


def clean_data(housing):
        housing['ocean_proximity'] = housing['ocean_proximity'].astype('category')
        housing['total_bedrooms'] = housing['total_bedrooms'].fillna(housing['total_bedrooms'].median())
        return housing

def view_histogram(housing):
    plt.figure(figsize=(10, 6))
    return housing.hist()


def get_x(housing):
    X = housing.drop(columns='median_house_value')
    return X

X = get_x(read_csv())

def get_y(housing):
    y = housing['median_house_value']
    return y

y = get_y(read_csv())

def split_dataset(X,y, test_size=0.2, random_state=42):
    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=test_size, random_state=random_state)
    return X_train, X_test, y_train, y_test

X_train, X_test, y_train, y_test = split_dataset(X, y, 0.2, 42)


def shape(X_train,y_train,X_test,y_test):
    return X_train.shape, y_train.shape, X_test.shape, y_test.shape



def processed_dataset():
    num_column = make_pipeline(
        SimpleImputer(strategy='median'),
        StandardScaler()
    )

    cat_column = make_pipeline(
        OneHotEncoder(handle_unknown='ignore')
    )

    processed = ColumnTransformer([
        ('num', num_column, make_column_selector(dtype_include=np.number)),
        ('cat', cat_column, make_column_selector(dtype_exclude=np.number))
    ])
    return processed

def train_process():
    housing = read_csv()
    train_processed =  processed_dataset().fit_transform(X_train)
    test_processed = processed_dataset().fit_transform(X_test)
    return train_processed,test_processed



def linear_regression():
    linear_reg = make_pipeline(processed_dataset(), LinearRegression())
    linear_reg.fit(X_train, y_train)
    y_pred = linear_reg.predict(X_train)
    y_train.iloc[:5]
    linear_rmse = root_mean_squared_error(y_train, y_pred)
    linear_val = -cross_val_score(linear_reg, X_train, y_train, cv=5, scoring='neg_root_mean_squared_error')
    lin = make_pipeline(processed_dataset(), RandomForestRegressor())
    y_pred = lin.predict(X_train)
    return y_pred[:5].round(-2)


def train_model():
    model = make_pipeline(processed_dataset(),LinearRegression())

    model.fit(X_train, y_train)

    return model
model = train_model()
joblib.dump(model, "housing_model.pkl")

