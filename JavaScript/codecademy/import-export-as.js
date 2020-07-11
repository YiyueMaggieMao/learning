// menu.js
let specialty = '';
let isVegetarian = function() {
}; 
let isLowSodium = function() {
}; 

export { specialty as chefsSpecial, isVegetarian as isVeg, isLowSodium };

// File that uses the exports
import { chefsSpecial, isVeg } from './menu';
console.log(chefsSpecial);
isVeg();