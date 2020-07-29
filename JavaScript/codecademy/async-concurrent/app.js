let {cookBeans, steamBroccoli, cookRice, bakeChicken} = require('./library.js')

const serveDinner = async() => {
 let vegetablePromise = steamBroccoli();
 let starchPromise = cookRice();
 let proteinPromise = bakeChicken();
 let sidePromise = cookBeans();
 console.log(`Dinner is served. We're having ${await vegetablePromise}, ${await starchPromise}, ${await proteinPromise}, and ${await sidePromise}.`)
}

serveDinner()

/* Alternative */
const serveDinnerAgain = async() => {
    let foodArray = await Promise.all([steamBroccoli(), cookRice(), bakeChicken(), cookBeans()]); 
    console.log(`Dinner is served. We're having ${foodArray[0]}, ${foodArray[1]}, ${foodArray[2]}, and ${foodArray[3]}.`)
}

serveDinnerAgain()
