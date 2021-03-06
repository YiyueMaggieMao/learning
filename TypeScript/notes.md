<h1> TypeScript Learning </h1>
<p> This file consists of some takeaways from my TypeScript learning process. This is <b>not a comprehensive guide</b>, but anyone is welcome to use this as a quick reference.</p>
<p> I will try to sort the content in their corresponding topics :D</p>

<h2 id="content">Content</h2>
<ul>
    <li><a href="#variables">Variables</a></li>
    <li><a href="#functions">Functions</a></li>
    <li><a href="#the-this-keyword">The "this" keyword</a></li>
    <li><a href="#interfaces">Interfaces</a></li>
    <li><a href="#classes">Classes</a></li>
    <li><a href="#misc-topics">Misc. Topics</a></li>
</ul>
<hr/>

<!--------------------------------------------- Variables ----------------------------------------------------->

<h2 id="variables">Variables</h2>
<p><a href="#types-of-variables">Types of Variables</a></p>
<p><a href="#variable-declaration">Variable Declaration</a></p>
<p><a href="#type-assertion">Type Assertion</a></p>
<p><a href="#union-types">Union Types</a></p>

<br/>
<h3 id="types-of-variables">Types of Variables</h3>
<p>The types of variables in TypeScript is similar to that of a general programming language, with the following exceptions:</p>
<ul>
	<li>All numbers (integer or not) are of type <code>number</code>. It supports binary, octal, decimal and hex values.</li>
    <li>Tuples in TypeScript are declared with <strong>square brackets</strong> (<code>[]</code>) instead of parenthesis.</li>
    <li>There is an <code>any</code> type that allows the variable to be of any type.</li>
</ul>
<p>Similar to JavaScript, TypeScript variables can also be decalred using <code>var</code>, <code>let</code>, and <code>const</code>.</p>

<br/>
<h3 id="variable-declaration">Variable Declaration</h3>
<p>A variable in TypeScript can be declared with the syntax <code> [var/let/const] [variable_name]:[type] = [value]</code>. </p>
<ul>
    <li>If we define a variable with no initial value, it will be initialized with the value <code>undefined</code>.</li>
    <li>If we define a variable with no initial type, then the variable can be of any type.</li>
</ul>
<p>Example from runoob:</p>
<pre><code>
var uname:string = "Runoob"; // uname is declared as a string with the inital value "Runoob"
var score1:number = 50; // score1 is declared as a number with the initial value 50
var score2:number = 42.50 // remember that number can hold non-integers as well
var sum = score1 + score2 // sum can be any type (in this case, it is of type number)
</code></pre>
<p>For arrays and tuples, we can also specify the type of their elements using the following syntax (examples from runoob): </p>
<pre><code>
let arr: number[] = [1, 2]; // declaring an array of type number
let x: [string, number]; // declaring a tuple where first index is a string and second index is number
x = ['Runoob', 1]; // note that x=[1, 'Runoob'] will throw an error
</code></pre>

<br/>
<h3 id="type-assertion">Type Assertion</h3>
<p>Type assertion in TypeScript can convert a variable to a type that overlaps with its current type. There are 2 ways to do type assertion in TypeScript. However, to avoid potential limitations when using tsx, the syntax <code>[variable] as [type]</code> is usually safer to use.</p>
<p>Example from my own experiementing:</p>
<pre><code>
const variable1 : number = 1
console.log(variable1 as string); // Error because number and string don't overlap
console.log((variable as any) + 1); // Output: 2. Any type can be casted into type "any"
</code></pre>
<p>Sometimes when 2 types don't overlap with each other, we can use <strong>double casting</strong> to bridge the conversion in between the 2 types. A common way to do so is by using <code>[variable] as [unknown/any] as [type]</code>.</p>
<p>Click <a href="https://github.com/YiyueMaggieMao/learning/blob/master/TypeScript/examples/double-casting.ts">here</a> to view an example of double casting from xcatliu.com.</p>

<br/>
<h3 id="union-types">Union Types</h3>
<p>In TypeScript, union types makes it possible for a variable to be assigned to one of the types in the union. The syntax for declaring a variable with a union type is <code>[var/let/const] [varName] : [type1] | [type2] | ...</code>. For example, <code>let x : boolean | number</code> will allow x to be either a boolean or a number.</p>
<p>It's worth noting that, when a variable declared with a union type has not been assigned a value, it can only access functions / properties that are common to <strong>all types</strong> in the union. Attempting to access a function / property that is in one of the unioned types but not others will result in an error. If it has been assigned a value, on the other hand, TypeScript will infer its type and let it access all functions / properties of the inferred type.</p>
<p>Example from xcatliu.com: </p>
<pre><code>
function getLength(something: string | number): number {
    return something.length; // Error because something hasn't been assigned a value, and number does not have a length property
}
<br/>
let myFavoriteNumber: string | number;
myFavoriteNumber = 'seven';
console.log(myFavoriteNumber.length); // 5
myFavoriteNumber = 7;
console.log(myFavoriteNumber.length); // Compile error
</code></pre>

<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Functions ----------------------------------------------------->

<h2 id="functions">Functions</h2>
<p><a href="#function-syntax">Function Syntax</a></p>
<p><a href="#type-inferrences">Type Inferrences</a></p>
<p><a href="#parameters">More on Parameters (optional, default, rest)</a></p>

<br/>
<h3 id="function-syntax">Function Syntax</h3>
<p>In TypeScript, we can specify the types of parameters as well as the return type of functions. Similar to variables, we put a colon (<code>:</code>) and the name of the type after each parameter to specify the type of the parameters. The return type of the function goes directly after the list of parameters and a fat arrow (<code>=></code>).  </p>
<p>An example from the offical TypeScript handbook on declaring a function: </p>
<pre><code>
let myAdd: (baseValue: number, increment: number) => number = function (
  x: number,
  y: number
): number {
  return x + y;
};
</code></pre>
<p>In the above example, on the left hand side of the equator, we have defined <code>myAdd</code> as a function that takes 2 arguments of type <code>number</code>, and returns a value of type <code>number</code>. </p>
<p>On the right hand side of the equator, we assign an anonymous function as the value of <code>myAdd</code>, and the value is, unsurprisingly, a function that takes in 2 <code>number</code> arguments, and returns a value of type <code>number</code>.
Note that the arguments on the left hand side of the equator don't have to be the same as those on the right hand side of the equator - they just have to be of the same type.</p>
<p>One possible way to help understand this syntax is by comparing the TypeScript declaration of a function to the Java declaration of an ArrayList. Both specify the type(s) of the content / parameter / return type on the left, and assign it the value of an anonymous ArrayList / function with the matching type(s) on the right.</p>

<br/>
<h3 id="type-inferrences">Type Inferrences</h3>
<p>As mentioned in the above section, valid full declarations of a function requires the types of parameters and return value to match for the left and right sides of the equator. This allows us to simplify our function declarations with type inferrence.</p>
<p>Let's look at 2 examples from the official TypeScript handbook (again):</p>
<pre><code>
let myAdd = function (x: number, y: number): number {
  return x + y;
};
<br/>
let myAdd2: (baseValue: number, increment: number) => number = function (x, y) {
  return x + y;
};
</code></pre>
<p>Note that the first example is inferring the type of <code>myAdd</code> from the right side of the equation. The logic is similar to declaring a variable in JavaScript.</p>
<p>The second example inferred the types of <code>x</code> and <code>y</code> from the types of <code>baseValue</code> and <code>increment</code>, making them both have the type <code>number</code>. </p>
<p>The above examples both used the concept of <strong>contextual typing</strong>, a form of type inferrence. Here's a link to <a href="https://www.typescriptlang.org/docs/handbook/type-inference.html">the official TypeScript Handbook explanation</a> of type inferrences, which contains more examples and concepts.</p>

<br/>
<h3 id="parameters">More on Parameters (optional, default, rest)</h3>
<p>Similar to most programming languages, too many or too few arguments in a function call will result in errors when we have strictly defined parameters. <strong>Optional parameters</strong> and <strong>default parameters</strong> are 2 potential ways of bringing flexibility to these situations. </p>
<h4>Optional Parameters</h4>
<p>To make a parameter optional, we can simply add a question mark (<code>?</code>) after the parameter name (but before the colon (<code>:</code>) that specifies the type). Below is an example from the official TypeScript handbook:</p>
<pre><code>
function buildName(firstName: string, lastName?: string) {
  if (lastName) return firstName + " " + lastName;
  else return firstName;
}
</code></pre>

<h4>Default Parameters</h4>
<p>In addition to that, we can give a default value to an optional parameter, in case it is missing from the function call. Adding a default value to an optional parameter makes it a <strong>default parameter</strong>. We can add a default parameter to a function by adding <code>parameterName = [defaultVal]</code> to the list of parameters.</p>
<p>Example from the offcial TypeScript handbook: </p>
<pre><code>
function buildName(firstName: string, lastName = "Smith") {
  return firstName + " " + lastName;
}

let result1 = buildName("Bob"); // works correctly now, returns "Bob Smith"
let result2 = buildName("Bob", undefined); // still works, also returns "Bob Smith"
let result3 = buildName("Bob", "Adams", "Sr."); // error, too many parameters
let result4 = buildName("Bob", "Adams"); // returns "Bob Adams"
</code></pre>

<p>Note that in <code>result2</code>, even though we provided <code>undefined</code> as the second argument to <code>buildName</code>, the default parameter still changed it to the default value. It's easy to understand, provided that a parameter defaults to <code>undefined</code> when we simply don't pass it in from the function call. Therefore, what the default parameter really does is changing the <code>undefined</code> value to its default value.</p>

<h4>Rest Parameters</h4>
<p>While optional and default parameters can decrease the lower bound of the number of possible arguments, rest parameters provides a way to allow a (theoretically) infinite number of arguments to a function call. To add a rest parameter, we add <code>...restParameterName: [type][]</code></p>
<p>Example from my own experimenting: </p>
<pre><code>
function buildShoppingList(mall: string, ...items: string[]) {
  return "Things to buy at " + mall + ": " + items.join(", ");
}
<br/>
let shoppingList = buildShoppingList("the Bookstore", "Binders", "Birthday Card", "iClicker");
console.log(shoppingList); // "Things to buy at the Bookstore: Binders, Birthday Card, iClicker" 
</code></pre>

<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- This ----------------------------------------------------->

<h2 id="the-this-keyword">The "this" keyword</h2>
<p><a href="#this-in-js">The "this" keyword in JavaScript</a></p>
<p><a href="#arrow-functions-n-this">Arrow Functions and "this"</a></p>
<p><a href="#this-parameters">"This" parameters</a></p>

<br/>
<h3 id="this-in-js">The "this" keyword in JavaScript</h3>
<p>In JavaScript, <code>this</code> refers to the context in which the object is created. For more information on the use of <code>this</code> in JavaScript, check out <a href="http://yehudakatz.com/2011/08/11/understanding-javascript-function-invocation-and-this/">this guide</a>.</p>
<p>Let's look at this example from runoob.com: </p>
<pre><code>
var person = {
  firstName: "John",
  lastName : "Doe",
  id     : 5566,
  fullName : function() {
    return this.firstName + " " + this.lastName;
  }
};
</code></pre>
<p>In the example above, if we call <code>person.fullName()</code>, the function <code>fullName</code> will be called in the context of the the class <code>person</code>. Consequently, <code>this.firstName</code> and <code>this.lastName</code> will refer to <code>person.firstName</code> and <code>person.lastName</code> respectively, which results the function call to return "John Doe".</p>
<p>However, doing the following will make the meaning of "this" change:</p>
<pre><code>
var person = {
  firstName: "John",
  lastName : "Doe",
  id     : 5566,
  fullName : function() {
    return function() {
      return this.firstName + " " + this.lastName;
    }
  }
};

let personFunction = person.fullName();
let nameString = personFunction();
</code></pre>
<p>The example above will cause an error. On the second to the last line, we invoked the function in context of the <code>Window</code> object (or in other words, the context that wraps outside <code>person</code>). Therefore, the <code>this</code> keyword inside the anonymous function now refers to the Window object (or <code>undefined</code> in strict mode), instead of the <code>person</code> object itself.</p>

<br/>
<h3 id="arrow-functions-n-this">Arrow Functions and "this"</h3>
<p>A potential workaround for the above scenario is by using <strong>arrow functions</strong>. By using arrow functions, it redefines the <code>this</code> keyword to be the context in which the function is <strong>created</strong>, rather than where it is <strong>invoked</strong>.</p>

<p>For example, we can tweak the previous example as following:</p>
<pre><code>
var person = {
  firstName: "John",
  lastName : "Doe",
  id     : 5566,
  fullName : function() {
    return () => {
      return this.firstName + " " + this.lastName;
    }
  }
};

let personFunction = person.fullName();
let nameString = personFunction();
console.log(nameString);
</code></pre>
<p>Because we declared the return function as an arrow function, when running the second to last line, the <code>this</code> keyword will be redirected to the <code>person</code> object, where we <strong>created</strong> the function, rather than the <code>Window</code>, where we <strong>invoked</strong> the function. Therefore, we can still access the members <code>firstName</code> and <code>lastName</code>, as we originally intended.</p>

<br/>
<h3 id="this-parameters">"This" parameters</h3>
<p>Despite our ability to specify the <code>this</code> keyword with regular and arrow functions, the type of <code>this</code> in these contexts are still <code>any</code>, unless we specify otherwise. One way to do so is by adding a <strong>"this" parameter</strong> to the parameter list. A "this" parameter always comes first in a parameter list, and will not be needed in function calls.</p>
<p>Please refer to <a href="https://github.com/YiyueMaggieMao/learning/blob/master/TypeScript/examples/this-parameter.ts">this example</a> (not included here due to format reasons) to see how to specify the <code>this</code> keyword in the example above.</p>
<p>Note that the code wouldn't work if we didn't create a <code>Person</code> type and instead simply defined <code>this</code> to be of type <code>Object</code>, since the <code>Object</code> type doesn't have members <code>firstName</code> and <code>lastName</code>.</p>

<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Interfaces ----------------------------------------------------->

<h2 id="interfaces">Interfaces</h2>
<p><a href="#interface-basics">Interface Basics</a></p>
<p><a href="#function-types">Function Types</a></p>
<p><a href="#indexable-types">Indexable Types</a></p>

<br/>
<h3 id="interface-basics">Interface Basics</h3>
<p>A TypeScript interface looks somewhat like a Java interface declaration, where we specify the name and type of each required property. However, in TypeScript, we can also make properties readonly by adding the <code>readonly</code> keyword before the property name, or optional by adding a question mark (<code>?</code>) after the property name. We can also specify the return types of its functions.</p>
<p>Let's look at an example below:</p>
<pre><code>
interface Cookie {
  madeBy: string,
  base: string,
  toppings?: string[],
  readonly timeBaked: Date,
  getDescription(): string
}
</code></pre>
<p>In the example above, we have defined a interface named <code>Cookie</code> with the following required properties: <code>madeBy</code> and <code>base</code> of type <code>string</code>, function <code>getDescription</code> that returns a <code>string</code>, and a readonly <code>Date</code> with the name <code>timeBaked</code>.</p>
<p>Note that we can also add parameters, including the this parameter, to <code>getDescription()</code>, if we intend for it to have any. On the other hand, if we don't want to specify the return type of <code>getDescription()</code>, we can simply replace the line with <code>getDescription: Function</code> (please notice that there are no parenthesis in this type of definition).</p>

<br/>
<h3 id="function-types">Function Types</h3>
<p>TypeScript interfaces can define more than just objects - it can define types of functions as well!</p>
<p>Let's look at a previous example on how we declared a function: </p>
<pre><code>
let myAdd = function (x: number, y: number): number {
  return x + y;
};
</code></pre>
<p>In the above example, we used <code>(x: number, y: number): number</code> to specify the type of the function, and we can use the exact same thing to declare an interface for this type of functions, by claring an interface with one singular property consisting of input parameters on the of the left hand side of the colon (<code>:</code>), and the return type on the right hand side, like the example below:</p>
<pre><code>
interface numFunc {
  (x: number, y: number): number
}
<br/>
let myAdd: numFunc = function (x: number, y: number): number {
  return x + y;
};
</code></pre>
<p>We can also use contextual typing to simplify our expression in declaring <code>numFunc</code>:</p>
<pre><code>
interface numFunc {
  (x: number, y: number): number
}
<br/>
let myAdd: numFunc = function (x,y) {
  return x + y;
};
</code></pre>
<p>Here, the parameters <code>x</code> and <code>y</code> have been both inferred as <code>number</code> types. Using methods that don't belong to <code>number</code> types on <code>x</code> or <code>y</code> will cause an error, and so will returning a value that's not of type <code>number</code> (For example, <code>return x < y</code> will cause a type mismatch in this scenario).</p>

<br/>
<h3 id="indexable-types">Indexable Types</h3>
<p>We can also make interfaces for <strong>indexable</strong> objects (for example, Arrays) in TypeScript by adding <code>[index: [string/number]]:[type-of-value]</code> as one of its properties. For example, <code>[index: string]:number</code> will allow indexing by property name, but all properties will need to be of type <code>number</code>. Similarly, <code>[index: number]:number</code> will allow indexing by indices.</p>
<p>It's worth noting that, if we wish to allow both number and string indexing, we will need to make sure the property types are consistent - i.e. making sure the <code>type-of-value</code> is the same for both lines.</p>
<p>An example on using indexable interfaces, provided by the Official TypeScript Handbook:</p>
<pre><code>
interface StringArray {
  [index: number]: string;
}

let myArray: StringArray;
myArray = ["Bob", "Fred"];

let myStr: string = myArray[0];
</code></pre>

<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Classes ----------------------------------------------------->

<h2 id="classes">Classes</h2>
<p><a href="#class-basics">Class Basics</a></p>
<p><a href="#class-inheritance">Class Inheritance</a></p>
<p><a href="#classes-implementing-an-interface">Classes Implementing an Interface</a></p>

<br/>
<h3 id="class-basics">Class Basics</h3>
<p>Let's start by looking at a simple example of a TypeScript class, from the official TypeScript Handbook:</p>
<pre><code>
class Greeter {
  greeting: string;
  constructor(message: string) {
    this.greeting = message;
  }
  greet() {
    return "Hello, " + this.greeting;
  }
}

let greeter = new Greeter("world");
</code></pre>
<p>It is apparent that this looks very similar to a Java class declaration. When translated into Java code, the above class will most closely resemble the following:</p>
<pre><code>
public class Greeter {
  public String greeting;
  public Greeter (String message){
    this.greeting = message;
  }
  public String greet(){
    return "Hello, " + this.greeting;
  }
}

Greeter greeter = new Greeter("World");
</code></pre>
<p>Note that the <code>public</code> keyword has been added when translating the TypeScript code into Java - that's because when unspecified, each member of a TypeScript class will default to <strong>public</strong>. If we wish otherwise, we can add keywords <code>private</code>, <code>protected</code>, or <code>readonly</code> before the member name. For example, if we wish to make the <code>greeting</code> field readonly, we can replace <code>greeting: string</code> with <code>readonly greeting:string</code> to make the change.</p>
<p>(P.S: The keywords <code>private</code> and <code>protected</code> work similarly as they do in Java - look <a href="https://www.typescriptlang.org/docs/handbook/classes.html#understanding-typescripts-private">here</a> to learn more about these. The <code>readonly</code> keyword has been explained in the <a href="#interface-basics">"Interface Basics" section</a> of the notes).</p>

<br/>
<h3 id="class-inheritance">Class Inheritance</h3>
<p>Similar to most OOP languages, class inheritance also exists in TypeScript. Using the <code>extends</code> keyword, we can make a child class that inherits the members of its parent class.</p>
<p>Click <a href="https://github.com/YiyueMaggieMao/learning/blob/master/TypeScript/examples/class-inheritance.ts">here</a> for an example on class inheritance from the Official TypeScript Handbook (not directly pasted due to spacing reasons).</p>
<p>As we can see from the example, we can override members in the parent class by defining it differently in the subclass (with the same name and type, and matching types of parameters, if any). We also have to call <code>super()</code> in the child class's constructor to be able to accesss any values with <code>this</code> in a constructor body - this is a very important rule in TypeScript.</p>

<br/>
<h3 id="classes-implementing-an-interface">Classes Implementing an Interface</h3>
<p>Now that we have introduced both classes and interfaces, it's worth noting that TypeScript classes can, too, implement an interface. Similar to most other OOP languages, classes in TypeScript can implement an interface using the <code>implements</code> keyword, and must provide implementations of all members of the interface</p>
<p>Let's look at the example below:</p>
<code><pre>
interface ClockInterface {
  currentTime: Date;
  setTime(d: Date): void;
}
<br/>
class Clock implements ClockInterface {
  currentTime: Date = new Date();
  setTime(d: Date) {
    this.currentTime = d;
  }
  constructor(h: number, m: number) {}
}
</code></pre>
<p>In the example above, we have defined a <code>Clock</code> class that extends off the <code>ClockInterface</code> interface. The members <code>currentTime</code> and <code>setTime</code> are required, though it can other members that are exclusive to the <code>Clock</code> class itself (for example, the constructor, and any other variables/functions).</p>

<br/>
<a href="#content">Back to Content</a>

<hr/>

<!--------------------------------------------- Misc. Topics ----------------------------------------------------->

<h2 id="misc-topics">Misc. Topics</h2>
<p><a href="#loops">Loops</a></p>

<br/>
<h3 id="loops">Loops</h3>
<p>The loops in TypeScript are mostly similar to that in JavaScript, except that we need to define any variable that we need to use in the loop conditions, before actually entering the loop. Failure to do so will result in a compile error.</p>
<p>For example, let's look at my TypeScript leetcode solution for #35 - Search Insert Position:</p>
<pre><code>
function searchInsert(nums: number[], target: number): number {
    let arrlen:number = nums.length;
    let i:number;
    for(i = 0; i < arrlen; i++) {
        if(nums[i] >= target) {return i;}
    }
    return arrlen;
};
</code></pre>