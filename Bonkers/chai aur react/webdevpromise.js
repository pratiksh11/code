let p = new Promise((resolve, reject) => {
    if (a) {
      resolve('Success');
    } else {
      reject('Failed');
    }
  });
  
  p.then((message) => {
    console.log('This is in the then:', message);
  }).catch((message) => {
    console.log('This is in the catch:', message);
  });
  //const fs = require('fs');

// Reading a file asynchronously
// const readFilePromise = new Promise((resolve, reject) => {
//     fs.readFile('example.txt', 'utf8', (err, data) => {
//       if (err) {
//         reject(err);
//       } else {
//         resolve(data);
//       }
//     });
//   });
  
//   readFilePromise
//     .then(data => {
//       console.log('File contents:', data);
//     })
//     .catch(error => {
//       console.error('Error reading file:', error);
//     });
// We create a promise (readFilePromise) that wraps the asynchronous operation of reading a file using the fs.readFile() function.
// The promise resolves with the file contents if the operation is successful, or rejects with an error if an error occurs.
// We then handle the resolved data in the .then() block and any errors in the .catch() block.