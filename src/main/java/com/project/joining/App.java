package com.project.joining;

import com.project.joining.service.JoiningService;

public class App {
    public static void main(String[] args) {
        final JoiningService joiningService = new JoiningService();
        joiningService.join();
    }
}
