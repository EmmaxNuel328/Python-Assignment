function transposedMatrix(matrix) {
    let transposed = [matrix[0].length][matrix.length];
    for (let row = 0; row < matrix.length; row++) {
        for(let column = 0; column < matrix[row].length; column++) {
            if (!transposed[column]) {
                transposed[column] = [];
            }
            transposed[column][row] = matrix[row][column];
        }
    }
    return transposed;
}


let matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
console.log(transposedMatrix(matrix));