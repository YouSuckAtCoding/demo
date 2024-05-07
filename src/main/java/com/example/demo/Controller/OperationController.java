package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {
    @GetMapping("/somar/{n1}/{n2}")
    public int Somar(@PathVariable("n1") int n1, @PathVariable("n2")int n2)
    {
        return n1 + n2;
    }
    @GetMapping("/subtrair/{n1}/{n2}")
    public int Subtrair(@PathVariable("n1") int n1, @PathVariable("n2")int n2)
    {
        return n1 - n2;
    }
    
    @GetMapping("/multiplicar/{n1}/{n2}")
    public int Multiplicar(@PathVariable("n1") int n1, @PathVariable("n2")int n2)
    {
        return n1 * n2;
    }
    @GetMapping("/dividir/{n1}/{n2}")
    public int Dividir(@PathVariable("n1") int n1, @PathVariable("n2")int n2)
    {
        return n1 / n2;
    }
    @GetMapping("/pow/{n1}/{n2}")
    public double Pow(@PathVariable("n1") int n1, @PathVariable("n2")int n2)
    {
        return Math.pow(n1, n2);
    }
}
