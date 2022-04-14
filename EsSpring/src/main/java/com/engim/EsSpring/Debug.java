package com.engim.EsSpring;

import com.engim.EsSpring.model.repository.StudenteRepository;

public class Debug {
    public static void main(String[] args) {
        System.out.println(StudenteRepository.selectStudenti());
    }
}
