def insertion_sorting(List):
    index =0
    previous_index = 0
    after_index = 0
    print("Index: ", index)
    sorted_list = []
    for tuple in List:
        if index == 0:
            sorted_list.append(List)
        if index == 1:
            previous_index = index - 1
            after_index = index + 1
            if List[index][0] < List[previous_index][0]:
                sorted_list.append(List[index])
                sorted_list.append(List[previous_index])
                sorted_list.append(List[after_index])
        if index == 2:
            previous_index = index - 1
            after_index = index + 1
            if List[index][0] < List[previous_index][0]:
                sorted_list.append(List[index])
        index += 1
    print("Sorted List: ", sorted_list)
    return sorted_list
    