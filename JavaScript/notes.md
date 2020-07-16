<h1> JavaScript Learning </h1>
<p>Find the documentation of JavaScript Reference <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference">here</a> </p>
<p> This file consists of some takeaways from my JavaScript learning process. This is <b>not a comprehensive guide</b>, but anyone is welcome to use this as a quick reference.</p>
<p> I will try to sort the content in their corresponding topics :D</p>

<h2 id="content">Content</h2>
<ul>
    <li><a href="#variables">Variables</a></li>
    <li><a href="#functions">Functions</a></li>
    <li><a href="#arrays">Arrays</a></li>
    <li><a href="#iterators">Iterators</a></li>
    <li><a href="#objects">Objects</a></li>
    <li><a href="#modules">Modules</a></li>
    <li><a href="#promises">Promises</a></li>
</ul>

<hr/>

<!--------------------------------------------- Variables ----------------------------------------------------->

<h2 id="variables">Variables</h2>
<p><a href="#types-of-variables">Types of Variables</a></p>
<p><a href="#template-literals">Template Literals</a></p>

<br/>
<h3 id="types-of-variables">Types of Variables</h3>
<p>There are three types of variables in Javascript: </p>
<ul>
<li><code>var</code> : Declares a <b>global</b> variable whose value can be changed</li>
<li><code>let</code> : Declares a <b>local</b> variable whose value can be changed</li>
<li><code>const</code> : Declares a <b>local</b> variable whose value <b>can not</b> be changed</li>
</ul>
<p>Note that <code>var</code> and <code>let</code> can be declared without an initial value, and will
store the primitive datatype <code>undefined</code> if uninitialized. On the other hand, <code>const</code> must be assigned
an initial value. </p>

<br/>
<h3 id="template-literals">Variables and Template Literals</h3>
<p>We can use template literals for better readability of the code. We wrap template literals in backticks 
<code>`</code>. To use the value of a variable inside a template literal, put <code>${variable_name}</code> in between the backticks.</p>
<p>Example from Codecademy:</p>
<pre><code>
const myPet = 'armadillo';
console.log(`I own a pet ${myPet}.`); // This will print "I own a pet armadillo"
</code></pre>
<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Functions ----------------------------------------------------->

<h2 id="functions">Functions</h2>
<p><a href="#default-parameters">Default Parameters</a></p>
<p><a href="#arrow-functions">Arrow Functions</a></p>
<p><a href="#concise-body-functions">Concise Body Functions</a></p>

<h3 id="default-parameters">Default Parameters</h3>
<p>In JavaScript, we can use <b>default parameters</b> to use default values in case certain parameter(s) are not defined upon function call.</p>
<p>Example from Codecademy:</p>
<pre><code>
function greeting (name = 'stranger') {
    console.log(`Hello, ${name}!`)
}
greeting('Nick') // Output: Hello, Nick!
greeting() // Output: Hello, stranger!
</code></pre>

<br/>
<h3 id="arrow-functions">Arrow Functions</h3>
<p>A more concise way to write functions.</p>
<p>We start by declaring the function (usually as <code>const</code>), then assign it to parameter wrapped in parenthesis <code>( )</code>, followed by a fat arrow <code>=></code> to a pair of brackets <code>{}</code> containing the body of the function.</p>
<p>Example from Codecademy:</p>
<pre><code>
const rectangleArea = (width, height) => {
    let area = width * height;
    return area;
};
</code></pre>

<br/>
<h3 id="concise-body-functions">Concise Body Functions</h3>
<p>This applies to functions that have a <b>one-line body</b>, and decreases the code volume.</p>
<p>The parenthesis <code>( )</code> is optional if there is a singular parameter. The section after the fat arrow <code>=></code> is the return value. </p>
<p>Example from Codecademy:
    <code>
    const squareNum = num => num * num;
    </code>
</p>
<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Arrays ----------------------------------------------------->

<h2 id="arrays">Arrays</h2>
<p><a href="#arrays-w-let-n-const">Arrays with Let and Const</a></p>
<p><a href="#push-n-pop">Push and Pop</a></p>

<br/>
<h3 id="arrays-w-let-n-const">Arrays with Let and Const</h3>
<p>While the variables declared with <code>const</code> are non-mutable, the elements stored in a const array
are still mutable. The only thing we can't do is reassigning a const array to a different array.</p>
<p>For example, if we have an array <code>const actions = ['eat', 'sleep', 'code']</code>, we can do 
<code>actions[1] = 'drink coffee'</code>, but not <code>actions = ['eat', 'drink coffee', 'code']</code>.</p>

<br/>
<h3 id="push-n-pop">Push and Pop</h3>
<p> The <code>push()</code> and <code>pop()</code> methods add / remove items at the <b>end</b> of an array.</p>
<p> We can push <b>multiple items</b> to an array by adding arguments to the <code>push()</code>, while
<code>pop()</code> removes the last element which we can store as a variable.</p>
<p>Because these two methods simply modifies the content of the array, they are <b>allowed on const arryas</b>.</p>
<p> Example from Codecademy + personal understanding: </p>
<pre><code>

const newItemTracker = ['item 0', 'item 1', 'item 2'];
const removed = newItemTracker.pop();

console.log(newItemTracker); // Output: [ 'item 0', 'item 1' ]
console.log(removed); // Output: item 2

newItemTracker.push('item3', 'item4');
console.log(newItemTracker); // Output: [ 'item 0', 'item 1', 'item 3', 'item4' ]
</code></pre>
<p>Redirect to 
<a href="https://github.com/YiyueMaggieMao/learning/blob/master/JavaScript/codecademy/more-array-methods.js">codecademy/more-array-methods.js</a> to see more examples of array functions.
Find the documentation of JavaScript Array <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array">here</a>.</p>

<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Iterators ----------------------------------------------------->
<h2 id="iterators">Iterators</h2>
<p><a href="#for-each">Methods: forEach() and map()</a></p>
<p><a href="#more-iter-func">More Iterator functions</a></p>

<br/>
<h3 id="for-each">Methods: forEach() and map()</h3>
<p>Two of the JavaScript methods that behave like enhanced for loops are <code>forEach()</code> and <code>map()</code>.</p>
<p>Similar to the enhanced for loop, the <code>forEach()</code> method iterates through every element of an array.
The <code>forEach()</code> method <b>does not</b> create a new array, but simply does operations on each instance of the array. It takes a function as the parameter, and can be called with the syntax <code>arrayName.forEach(function)</code>.
<p>The <code>map()</code> method, on the other hand, creates a new array from the values in a previously exisiting array. The <code>map()</code> function can called with the syntax 
<code>const newArray = oldArray.map(function)</code>, and the function <b>must have a return value</b>.</p>
<p>Example from Codecademy + personal understanding: </p>
<pre><code>
const numbers = [1, 2, 3];
fruits.forEach(num => console.log(num)); // Simply outputs 1, 2, 3 in order
const newNumbers = numbers.map(num => num*2); // newNumbers will be a new array with values 2, 4, 6
</code></pre>
<p>Note that in the example above, we use the name <code>num</code> to refer to the current instance in the array, ,uch like how we use an enhanced for loop in Java.</p>

<br/>
<h3 id="more-iter-func">More Iterator functions</h3>
<p>Other than <code>forEach()</code> and <code>map()</code>, JavaScript has many more Iterator functions. Examples include: </p>
<ul>
    <li><code>filter()</code> takes a function returning a boolean as an argument, and returns a new array with all the elements that have the function return <b>true</b>.</li>
    <li><code>findIndex()</code> takes a function returning a boolean as an argument, and returns the index of the first element that has the function return <b>true</b>.</li>
    <li><code>reduce()</code> returns a <b>singular value</b> after iterating through the array. <a href="https://github.com/YiyueMaggieMao/learning/blob/master/JavaScript/codecademy/iterator-reduce.js">Example with annotation</a> </li>
</ul>
Find more iterator methods <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array">here</a>.</p>

<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Objects ----------------------------------------------------->
<h2 id="objects">Objects</h2>
<p><a href="#object-basics">Object Declaration, Get, Set</a></p>
<p><a href="#add-remove-prop"> Adding and Removing Props </a></p>
<p><a href="#object-methods">Object Methods</a></p>
<p><a href="#getters-n-setters">Getters and Setters</a></p>
<p><a href="#loop-thru-objects">Looping Through Objects</a></p>
<p><a href="#this-in-objects">The "this" keyword</a></p>

<br/>
<h3 id="object-basics">Object Declaration, Get, Set</h3>
<p>JavaScript objects have bodies consisting of <b>props</b>, which looks like <b>key-value pairs</b>. The props of an object looks like <code>propName: value</code>, or multi-word prop names like <code>'Multi Word Prop Name': value</code>. The props are seperated by commas <code>,</code> .</p>
<p>To get the value of a prop, we can use either <code>objectName.propName</code> (dot notation) or <code>objectName['propName']</code> (bracket notation). The set the value of a prop, we can put either the dot or bracket notation of the prop on the left hand side, and assign it to the value that we want to update it to be. </p>
<p>Objects can also <a href="https://github.com/YiyueMaggieMao/learning/blob/master/JavaScript/codecademy/nested-objects.js"> have objects as their props</a>, and we will call those object props <code>nested objects</code>. </p>

<p>Example from Codecademy (Modified):</p>
<pre><code>
const spaceship = {
  'Fuel Type': 'Turbo Fuel',
  homePlanet: 'Earth',
  mission: 'Explore the universe' 
}; // Declares an object named spaceship with 3 props

console.log(spaceship.homePlanet) // Get with dot notation
spaceship['Fuel Type'] = 'Unicorn Hair'; // Set with bracket notation
</code></pre>

<p>Side note: If we want to indicate that a private property, we can put an underscore <code>_</code> before the property name (For example, <code>_private-prop</code>). We *can* still access / change the value of that property outside the object, but it's a good notation to remind us of the intended usage.</p>

<br/>
<h3 id="add-remove-prop">Adding and Removing Props</h3>
<p> To add a prop to an object, we can simply call <code>objectName.propName = value</code>; to remove one, we call <code>delete objectName.propName</code>.
<p>Continuing the example of the above section, here's how we can add and remove props from the spaceship object: </p>
<pre><code>
spaceship[destination] = 'Mars'; // Adds a new destination prop to spaceship, and set its value to Mars
delete spaceship.mission; // spaceship will no longer have a mission prop
</code></pre>

<br/>
<h3 id="object-methods">Object Methods</h3>
<p>A method is a property of an object that is a function. To declare a method, we can put an anonymous function expression as the value, and the key will be the name of the method. We can also omit the colon and the function keyword using the ES6 expression, which I will include in the <a href="#object-methods-example">example below</a>.</p>
<p>To invoke a method, we simply use the regular dot notation, <code>objectName.methodName(params)</code>. </p>
<p>Example from Codecademy</p>
<pre><code>
let retreatMessage = 'We no longer wish to conquer your planet. It is full of dogs, which we do not care for.';<br/>
// Below demonstrates the 2 different ways to declare object methods
let alienShip = {
    retreat: function(){
            console.log(retreatMessage);
    },
    takeOff(){
        console.log('Spim... Borp... Glix... Blastoff!');
    }
};

// Calls the methods
alienShip.retreat();
alienShip.takeOff();
</code></pre>
<p>Side note: JavaScript Objects has <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object">a library of built-in functions</a> that we can call on any declared object. View an Codecademy example of utilizing some of these functions <a href="https://github.com/YiyueMaggieMao/learning/blob/master/JavaScript/codecademy/built-in-object-methods.js">here</a>.</p>

<br/>
<h3 id="getters-n-setters">Getters and Setters</h3>
<p> Unlike many other programming languages, getters and setters in JavaScript need to be specified using the <code>get</code> and <code>set</code> keywords, followed by the name of the variable that we want to change (which is also the name of the getter/setter). Getters and setters are typically used on <b>private variables</b>. We can use the getter method by assigning the value <code>objectName.getterName</code> to a variable, and the setter method by assigning <code>objectName.getterName</code> a value. </p>
<p> Example from Codecademy (trimmed for concision): </p>
<pre><code>
const robot = {
  _numOfSensors: 15,
  get numOfSensors(){
    if(typeof this._numOfSensors === 'number'){ return this._numOfSensors; } 
  },<br/>
  set numOfSensors(num){
    if(typeof num === 'number' && num >= 0){ this._numOfSensors = num; }
  }
};

robot.numOfSensors = 100; // Sets the number of sensors
console.log(robot.numOfSensors); // Gets the number of sensors
</code></pre>

<br/>
<h3 id="loop-thru-objects">Looping Through Objects</h3>
<p>We can loop through all the nested objects under an object with the <code>for...in</code> syntax. The basic syntax looks like: <code>for (nestedObject in object){doSomething()};</code> , in which the <code>nestedObject</code> will hold the name of the object, and will be accessible as a string throughout the function body.</p>
<p>View the codecademy example of looping through objects <a href="https://github.com/YiyueMaggieMao/learning/blob/master/JavaScript/codecademy/loop-through-objects.js">here</a>. </p>

<br/>
<h3 id="this-in-objects">The "this" Keyword</h3>
<p>In JavaScript, the keyword <code>this</code> has different meanings in bracket and arrow functions. In bracket functions, <code>this</code> refers to the object that the function is within, while in arrow functions, <code>this</code> refers whatever the <code>window</code> or <code>global</code> object, much like how we use <code>this</code> in Java.</p>

Example from Codecademy + personal understanding:
<pre><code>
const animal1 = {
    sound: 'baaa',
    bracketSound() {
        return this.sound; // will return 'baaa', this == animal 1
    }
    arrowSound: () => {
        return this.sound; // will return undefined, this == global or window object
    }
}
</code></pre>

<p>The general idea is to avoid using arrow functions when we need to use the <code>this</code> keyword; however, <a href="https://www.codementor.io/@dariogarciamoya/understanding-this-in-javascript-with-arrow-functions-gcpjwfyuc#api-calls">here is a good example</a> of when arrow functions can be useful, according to codementor.</p>


<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Classes ----------------------------------------------------->
<h2 id="classes">Classes</h2>
<p><a href="#inheritance">Inheritance</a></p>
<p><a href="#static-methods">Static Methods</a></p>

<h3 id="inheritance">Inheritance</h3>
<p>JavaScript, like Java, is an <b>Object-Oriented Language</b>. Also like Java, JavaScript can have classes that are extensions of other classes which also uses the <code>extends</code> keyword. However, unlike most other OOP languages, we need to explicitly call the super class constructor using the <code>super(props)</code> statement.</p>
<p>Example from Codecademy + annotations: </p>
<pre><code>
// Assuming we already have an Animal class defined
class Cat extends Animal {
  constructor(name, usesLitter) {
    super(name); // Calls the Animal class constructor with the name argument
    this._usesLitter = usesLitter; // Defines a prop unique to Cat class
  }
} // This class automatically inherits all the methods of the Animal class
</code></pre>
View a more complete example using JavaScript class inheritance <a href="https://github.com/YiyueMaggieMao/learning/blob/master/JavaScript/codecademy/class-inheritance.js">here</a>.</p>

<br/> 
<h3 id="static-methods">Static Methods</h3>
<p>In JavaScript, the static methods are methods that are accessible through <b>only the class itself</b>, but not the specific instances of it. Like most other OOP languages, the static methods in JavaScript are indicated using the keyword <code>static</code>.
<p>Example from personal understanding: </p>
<pre><code>
class Cashier {
    static cashMoney(){
        Console.log("Here comes the $$$! :D");
    }
}

Cashier.cashMoney(); // Will log the statement
const maggie = new Cashier();
maggie.cashMoney(); // Can't do this because maggie is an individual instance :(
</code></pre>

<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Modules ----------------------------------------------------->
<h2 id="modules">Modules</h2>
<p><a href="#export-use-modules">Exporting and Using Modules</a></p>
<p><a href="#named-exports">Named exports</a></p>


<h3 id="exoport-use-modules">Exporting and Using Modules</h3>
<p>In JavaScript, we can export modules from files and to be able to be accessed from another file. We define the exports of a file using the line <code>module.exports = moduleName</code>, if we have one singular export; or we can wrap any collection of data in a singular object, and use the syntax <code>module.exports = {...}</code>.</p>
<p>We can access the exports of others files using <b>require</b>. We pass the relative path of the file with exports as an argument to the <code>require()</code> function, and assign it to a const value. To access specific output modules, we can use the syntax <code>exportValName.moduleName</code> to access their values.</p>
<p>Example from Codecademy illustrating one singular export: </p>
<pre><code>
// Code in menu.js 
let Menu = {};
Menu.specialty =  "Roasted Beet Burger with Mint Sauce";
module.exports = Menu; 

// Code in order.js that uses the Menu module
const Menu = require('./menu.js');
function placeOrder() {
  console.log('My order is: ' + Menu.specialty);
}
</code></pre>
<p>Example from StackOverflow + personal understanding illustrating multiple exports: </p>
<pre><code>
// Decalring exports, assuming function2 has already been defined
module.exports = {
  moduleString: "Hello World",
  method: function2
}

// Accessing modules
var myModule = require("./lib/file.js")
const method = myModule.method;
</pre></code>

<p>Note: the <code>module.exports()</code> method is more used for Node.js, which does not support the ES6 syntax. For environments that use the ES6 syntax, such as frontend development, we use the syntax <code>export default moduleName</code>. View an example of export defualt <a href="https://github.com/YiyueMaggieMao/learning/blob/master/JavaScript/codecademy/export-default.js">here</a>.</p>

<br/>
<h3 id="named-exports">Named Exports</h3>
<p>In environments that support ES6, we can use named exports, practically giving a name to the elements that we export. Additionally, we can export variables / functions as soon as they are declared, simply by adding the <code>export</code> keyword in front of the declaration. We import them the same way as we normally do with named exports.</p>
<p>Example from Codecademy illustrating immediate exports: </p>
<pre><code>
// menu.js
export let specialty = 'Honey Butter Garlic Chicken';
export function isVegetarian() {
  return false;
}; 

// Another file that uses the imports
import {specialty, isVegetarian} from './menu';
</code></pre>
<p>View an example of named exports (without immediate exports) <a href="https://github.com/YiyueMaggieMao/learning/blob/master/JavaScript/codecademy/named-exports.js">here</a>.</p>
<p>We can also <a href="https://github.com/YiyueMaggieMao/learning/blob/master/JavaScript/codecademy/import-export-as.js">change the names of exports using the "as" keyword</a>.</p>

<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Promises ----------------------------------------------------->
<h2 id="promises">Promises</h2>
<p><a href="#promise-basics">Promise Basics, Resolve, Reject</a></p>
<p><a href="#chaining-promises">Chaining Promises</a></p>
<p><a href="#promise-all">Promise.all()</a></p>

<h3 id="promise-basics">Promise Basics, Resolve, Reject</h3>
<p>In Javascript, promises are <b>objects</b> that can resolve or reject a certain request depending on the circumstances. Depending on whether request was resolved or rejected, we can append the promise object with the <code>then()</code> method to carry out different functionalities depending on the result. The <code>then()</code> method takes two optional functions parameters, the first one handling resolve and the second one handling reject.</p>
<p>We also usaually make promises by returning them in <b>asynchronous</b> functions. To make the functions asynchronous, we use the method <code>setTimeOut(functionName, timeInMs)</code>. </p>
<p>Example from Codecademy:</p>
<pre><code>
// library.js has the checkInventory function 
// that is asynchronous and returns a promise object
const {checkInventory} = require('./library.js'); 
const order = [['sunglasses', 1], ['bags', 2]];

const handleSuccess = (successMessage) => {
  console.log(successMessage);
}
const handleFailure = (failureMessage) => {
  console.log(failureMessage);
}<br/>
// handleSuccess will run on resolve, and handleFailure will run on reject
prom = checkInventory(order).then(handleSuccess, handleFailure);
</code></pre>
<p>In the above example, because both arguments are optional, if we only want to handle success, we can do <code>checkInventory(order).then(handleSuccess)</code>. On the other hand, if we only want to handle failure, we can do <code>checkInventory(order).then(null, handleFailure)</code>. </p>
<p>Another way to do this, however, is to use the <code>catch()</code> method. Unlike <code>then()</code>, its argument consists of only <b>one funciton</b>, which will be triggered only when the promise <b>rejects</b>.</p>
<p>That being said, the other way of writing the last line of the previous code block is: </p>
<pre><code>
prom = checkInventory(order)
.then(handleSuccess)
.catch(handleFailure);
</code></pre>

<br/>
<h3 id="chaining-promises">Chaining Promises</h3>
<p>Sometimes when performing a task, we want to separate it into a chain of events that will give responses at each step. We can do this by using <b>promise chaining</b>, which we can achieve by returning the call to the second promise function in a handler function of the first promise function. We can then put the handler of the second promise function after the first.</p>
<p>Example from Codecademy, simplified:</p>
<pre><code>
checkInventory(order)
    .then((resolvedValueArray) => {
        return processPayment(resolvedValueArray)})
    .then((resolvedValueArray) => {
        return shipOrder(resolvedValueArray)})
    .then((successMessage) => {
              console.log(successMessage);
    })
    .catch((rejectionReason) => {
        console.log(rejectionReason);
    });
</code></pre>
<p>Notice that the last <code>catch()</code> statement will catch the first rejection that happens, and log the rejection reason onto the console.</p>
<p>Click <a href="https://github.com/YiyueMaggieMao/learning/blob/master/JavaScript/codecademy/chaining-promises.js">here</a> for the full Codecademy code on the promising chaining. </p>

<br/>
<h3 id="promise-all">Promise.all()</h3>
<p>In situations where we need to resolve multiple promises (in a <b>parallel</b> instead of step-by-step relationship when we chain promises), we can use <code>Promise.all()</code> with promise functions as arguments, to check if all the promises returned from the argument functions resolved. We can add the <code>then()</code> and <code>catch()</code> methods too, as the method also returns a promise that resolves only if all the argument promises resolve, and rejects otherwise.</p>
<p>Example from Codecademy, simplified:</p>
<pre><code>
let checkSunglasses = checkAvailability('sunglasses', 'Favorite Supply Co.');
let checkPants = checkAvailability('pants', 'Favorite Supply Co.');
let checkBags = checkAvailability('bags', 'Favorite Supply Co.');

Promise.all([checkSunglasses, checkPants, checkBags])
.then(onFulfill)
.catch(onReject);
</code></pre>
<p>View the full Codecademy example <a href="https://github.com/YiyueMaggieMao/learning/blob/master/JavaScript/codecademy/promise-all.js">here</a>.</p>

<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Coming Soon ----------------------------------------------------->