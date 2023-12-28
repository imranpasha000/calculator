function sortArrayDescending(arr) {

    // Use the Array.sort() method with a custom compare function
  
    const sortedArray = arr.sort((a, b) => b - a);
  
    return sortedArray;
  
  }
  
   
  
  // Example usage:
  
  const inputArray = [5, 2, 8, 1, 3];
  
  const sortedDescendingArray = sortArrayDescending(inputArray);
  
  console.log(sortedDescendingArray);
  
  // Output: [8, 5, 3, 2, 1]