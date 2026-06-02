const express = require('express');
const app = express() ; 

const PORT = process.env.PORT || 5000 ; 

// define endpoint to fetch posts
app.get("/posts", async (req, res)=> {
    try{
        const responce = await fetch("https://jsonplaceholder.typicode.com/posts/10") ; 
        const data = await responce.json() ; 
    }catch(error){
        console.log("Error fetching posts:" , error);
        res.status(500).json({ error : "Error fetching posts"}) ; 
    }
})

// define endpoint to fetch post by id as query parameter
app.get("/posts/:id" , async(req, res)=> {
    const {id} = req.params ; 
    try{
        const responce = await fetch(`https://jsonplaceholder.typicode.com/posts/${id}`) ; 
    }catch(error){
        console.error("Error fetching post by id:", error) ; 
        res.status(500).json({error: "Error fetching post by id"})
    }
}) ; 

app.listen(PORT, ()=>{
    console.log(`Server is running on http://localhost:${PORT}`)
});