interface Person {
    firstName: string,
    lastName: string,
    id: number,
    fullName: Function
}
  
var person:Person = {
    firstName: "John",
    lastName : "Doe",
    id     : 5566,
    fullName : function(this:Person) {
      return () => {
        return this.firstName + " " + this.lastName;
      }
    }
};
  
let personFunction = person.fullName();
let nameString = personFunction();
console.log(nameString);