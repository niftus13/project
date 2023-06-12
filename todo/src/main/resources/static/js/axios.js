    const getPosts = async() => {
        const res = await axios.get(path)
        return res.data
    }

    const getPostOne = async(id) => {
        const res = await axios.get(`${path}/${id}`)
        return res.data
    }

    const deletePostOne =async(id) => {
        const res = await axios.delete(`${path}/${id}`)
        return res.data
    }

    const addDataPost = async(obj) =>{

        console.log(obj)
        const res = await axios.post(path,obj)
        return res.data
    }

    const modifyPut = async(obj) =>{

        console.log(obj)
        const res = await axios.put(`${path}/${obj.id}`,obj)
        return res.data
    }
