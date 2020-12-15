<h1> TypeScript Learning </h1>
<p> This file consists of some takeaways from my TypeScript learning process. This is <b>not a comprehensive guide</b>, but anyone is welcome to use this as a quick reference.</p>
<p> I will try to sort the content in their corresponding topics :D</p>

<h2 id="content">Content</h2>
<ul>
    <li><a href="#variables">Variables</a></li>
</ul>
<hr/>

<!--------------------------------------------- Variables ----------------------------------------------------->

<h2 id="variables">Variables</h2>
<p><a href="#types-of-variables">Types of Variables</a></p>
<p><a href="#variable-declaration">Variable Declaration</a></p>
<p><a href="#type-assertion">Type Assertion</a></p>

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
<a href="#content">Back to Content</a>

<hr/>