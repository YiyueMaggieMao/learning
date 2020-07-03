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

<!--------------------------------------------- Coming Soon ----------------------------------------------------->