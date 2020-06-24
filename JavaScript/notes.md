<h1> JavaScript Learning </h1>
<p>Find the documentation of JavaScript Reference <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference">here</a> </p>
<p> This file consists of some takeaways from my JavaScript learning process. This is <b>not a comprehensive guide</b>, but anyone is welcome to use this as a quick reference.</p>
<p> I will try to sort the content in their corresponding topics :D</p>

<h2 id="content">Content</h2>
<ul>
    <li><a href="#variables">Variables</a></li>
    <li><a href="#functions">Functions</a></li>
    <li><a href="#arrays">Arrays</a></li>
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
    console.log(`Hello, ${name}!`)<
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

<!--------------------------------------------- Coming Soon ----------------------------------------------------->