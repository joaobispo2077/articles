const express = require('express');

const PORT = process.env.PORT || 3333;

const app = express();

app.get('/', (_, response) => response.json({
  message: 'Hello World from Node.js!',
}));

app.listen(PORT, () => console.log(`Server running on port ${PORT}`));