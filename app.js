const express = require('express');
const app = express();

app.get('/', (req, res) => {
    res.send({

    })
});

app.post('/', (req, res) => {
    let object = {
        name: "coruscate",
        address: {
            line1: "surat",
            pincode: 395006
        },
        members: [{
            name: "mem1"
        }]
    }
    res.json(object);
})

app.listen(3000);