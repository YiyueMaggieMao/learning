const numbers = [1, 2, 4, 10];

const summedNums = numbers.reduce((accumulator, currentValue) => {
  return accumulator + currentValue // Returns the new value of accumulator
}, 100)  // Initialize accumulator to 100

console.log(summedNums); // Output: 117