**Brute Force Approach**
1. First we traverse through the matrix in search of zeros,
2. When we find a zero we traverse for it's respective rows and col and turn them to -1 except zeros.
3. Then we traverse in the whole array again for changing the -1's to zeros
​
TC : O((n*m)*(n+m)) and SC: O(1)
​
static void setZeroes(int[][] matrix) {
int rows = matrix.length, cols = matrix[0].length;
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
if (matrix[i][j] == 0) {
​
int ind = i - 1;
while (ind >= 0) {
if (matrix[ind][j] != 0) {
matrix[ind][j] = -1;
}
ind--;
}
ind = i + 1;
while (ind < rows) {
if (matrix[ind][j] != 0) {
matrix[ind][j] = -1;
}