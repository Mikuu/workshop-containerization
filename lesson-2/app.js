const express = require('express');
const app = express();
const port = 3000;

const message = `Hello, this is the greeting from FBI, I'm happy now`;
app.get('/', (req, res) => res.send(message));

app.listen(port, () => console.log(`Example app listening at http://localhost:${port}`));
