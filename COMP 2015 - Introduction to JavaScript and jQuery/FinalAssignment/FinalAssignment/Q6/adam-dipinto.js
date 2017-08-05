//Final Assignment

//Literal
onload = function() {

  var book1 = {
    title: "Harry Potter",
    author: "JK Rowling",
    yearPublished: "2000",
    wizard:function(){
      console.log("You're a wizard, Harry");
    }
  }
  for (var prop in book1) {
    console.log(`book1.${prop} = ${book1[prop]}`);
  }

  //Constructor
  function bookTwo() {
    var book2 = new Object();

    book2.title = "Lord of the Rings";
    book2.author = "J. R. R. Tolkien";
    book2.yearPublished = "1954";
    book2.sam = function() {
      console.log("Sam was actually the real hero");
    }
    for (var prop in book2) {
      console.log(`book2.${prop} = ${book2[prop]}`);
    }
  }
  bookTwo();

  //Constructor Pattern

  function bookThree(theTitle, theAuthor, theYearPublished) {
    this.title = theTitle;
    this.author = theAuthor;
    this.yearPublished = theYearPublished;

    this.surprise = function() {
      console.log("I have the conch!");
    }
  }

  var book3 = new bookThree("Lord of the Flies", "William Golding", 1954);
  for (var prop in book3) {
    console.log(`book3.${prop} = ${book3[prop]}`);
  }

  //Prototype Pattern

  function bookFour() {
    this.title = "To Kill a Mockingbird";
    this.author = "Harper Lee";
    this.yearPublished = 1960;
    this.robinson = function() {
      console.log("I was just busting up a chiffarobe");
    }
  }

  var book4 = new bookFour();
  for (var prop in book4) {
    console.log(`book4.${prop} = ${book4[prop]}`);
  }


}
