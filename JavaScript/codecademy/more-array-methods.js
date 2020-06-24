const groceryList = ['orange juice', 'bananas', 'coffee beans', 'brown rice', 'pasta', 'coconut oil', 'plantains'];

groceryList.shift(); // Gets rid of first element, also returns that element

groceryList.unshift('popcorn'); // Inserts arguments in order in the beginning of the array,
                                // and returns the last argument
console.log(groceryList.slice(1,4)); // Kind of like substring for Java, does not modify the original array

const pastaIndex = groceryList.indexOf('pasta');
console.log(pastaIndex);