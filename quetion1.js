function shuffleArray(array) {

    var currentIndex = array.length, randomIndex, tempValue;

 

    while (currentIndex !== 0) {

 

    

        randomIndex = Math.floor(Math.random() * currentIndex);

        currentIndex--;

 

        tempValue = array[currentIndex];

        array[currentIndex] = array[randomIndex];

        array[randomIndex] = tempValue;

    }

 

    return array;

}

 

var myArray = [1, 2, 3, 4, 5];

shuffleArray(myArray);

console.log(myArray);