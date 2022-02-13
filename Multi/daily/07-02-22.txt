class Solution:
    def helper(self, matrix, row, col):
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][col] != 0:
                    matrix[i][col] = 'x'
                if matrix[row][j] != 0:
                    matrix[row][j] = 'x'

    def setRowColumnZeroes(self, matrix):
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j] == 0:
                    matrix[i][j] = 'x'
                    self.helper(matrix, i, j)

        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j] == 'x':
                    matrix[i][j] = 0
