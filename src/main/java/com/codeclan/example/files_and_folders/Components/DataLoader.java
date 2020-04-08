package com.codeclan.example.files_and_folders.Components;

import com.codeclan.example.files_and_folders.models.File;
import com.codeclan.example.files_and_folders.models.Folder;
import com.codeclan.example.files_and_folders.models.User;
import com.codeclan.example.files_and_folders.repositories.FileRepository;
import com.codeclan.example.files_and_folders.repositories.FolderRepository;
import com.codeclan.example.files_and_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User("Malcolm Holwill");
        userRepository.save(user1);

        User user2 = new User("Indie");
        userRepository.save(user2);

        Folder folder1 = new Folder("Homework", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Classwork", user2);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Classwork", user2);
        folderRepository.save(folder3);

        File file1 = new File("Project1", ".rb", 250, folder1);
        fileRepository.save(file1);

        File file2 = new File("Project2", ".rb", 260, folder1);
        fileRepository.save(file2);

        File file3 = new File("Project3", ".js", 3000, folder2);
        fileRepository.save(file3);

        File file4 = new File("Project4", ".java", 80, folder3);
        fileRepository.save(file4);

        File file5 = new File("Project5", ".java", 20000, folder3);
        fileRepository.save(file5);

    }
}
