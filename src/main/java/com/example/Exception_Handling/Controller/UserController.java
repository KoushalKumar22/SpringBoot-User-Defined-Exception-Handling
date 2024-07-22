package com.example.Exception_Handling.Controller;

import com.example.Exception_Handling.Entity.User;
import com.example.Exception_Handling.Exceptions.IdNotFoundException;
import com.example.Exception_Handling.Exceptions.NameNotFoundException;
import com.example.Exception_Handling.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository urepo;

    @GetMapping("/test")
    public String teste(){
        return "this is a test run";
    }

    @PostMapping("/save")
    public String save(@RequestBody User user){
        urepo.save(user);
        return "Data Saved";
    }

    @GetMapping("/all")
    public List<User> findAll(){
        return urepo.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<User> findById(@PathVariable int id)throws IdNotFoundException {
        Optional<User> user=urepo.findById(id);
        if (user.isEmpty()){
            throw  new IdNotFoundException("No Id Found Of Number: "+id);
        }
        return user;
    }

    @GetMapping("/name/{name}")
    public Optional<User> findByName(@PathVariable String name)throws NameNotFoundException{
        Optional<User> user=urepo.findByName(name);
        if (user.isEmpty()){
            throw new NameNotFoundException("No User Exist of The name: "+name);
        }
    return user;
    }
}
