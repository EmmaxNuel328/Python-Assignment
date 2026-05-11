# app.py

import streamlit as st
import pandas as pd
import joblib

# Load trained model
model = joblib.load("housing_model.pkl")

st.set_page_config(page_title="Housing Price Predictor", layout="wide")

st.title("🏠 Housing Price Predictor")

st.write("Enter housing information to predict the house price.")

# User Inputs
longitude = st.number_input("Longitude", value=-122.23)
latitude = st.number_input("Latitude", value=37.88)
housing_median_age = st.number_input("Housing Median Age", value=41.0)
total_rooms = st.number_input("Total Rooms", value=880.0)
total_bedrooms = st.number_input("Total Bedrooms", value=129.0)
population = st.number_input("Population", value=322.0)
households = st.number_input("Households", value=126.0)
median_income = st.number_input("Median Income", value=8.3252)

ocean_proximity = st.selectbox(
    "Ocean Proximity",
    [
        "<1H OCEAN",
        "INLAND",
        "NEAR OCEAN",
        "NEAR BAY",
        "ISLAND"
    ]
)

# Create dataframe
input_data = pd.DataFrame({
    "longitude": [longitude],
    "latitude": [latitude],
    "housing_median_age": [housing_median_age],
    "total_rooms": [total_rooms],
    "total_bedrooms": [total_bedrooms],
    "population": [population],
    "households": [households],
    "median_income": [median_income],
    "ocean_proximity": [ocean_proximity]
})

# Prediction
if st.button("Predict House Price"):
    prediction = model.predict(input_data)

    st.success(
        f"Predicted House Price: ${prediction[0]:,.2f}"
    )


    st.toast("Prediction complete!")
    import time

    progress = st.progress(0)

    for i in range(100):
        time.sleep(0.01)
        progress.progress(i + 1)

    with st.spinner("Predicting..."):
        prediction = model.predict(input_data)