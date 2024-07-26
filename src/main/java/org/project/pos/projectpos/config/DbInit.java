package org.project.pos.projectpos.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.project.pos.projectpos.auth.model.entity.RoleEntity;
import org.project.pos.projectpos.auth.model.entity.UserEntity;
import org.project.pos.projectpos.auth.repository.RoleRepo;
import org.project.pos.projectpos.auth.repository.UserRepo;
import org.project.pos.projectpos.category.model.CategoryEntity;
import org.project.pos.projectpos.category.repository.CategoryRepo;
import org.project.pos.projectpos.product.model.ProductEntity;
import org.project.pos.projectpos.product.repository.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class DbInit implements CommandLineRunner {
    private final PasswordEncoder encoder;
    private final RoleRepo roleRepo;
    private final UserRepo userRepo;
    private final CategoryRepo categoryRepo;
    private final ProductRepo productRepo;

    public void run(String... args) throws Exception {
        initRole();
        initUser();
        initCategory();
        initProduct();
    }

    public void initRole(){
        if(roleRepo.count() > 0) {
            log.info("Role has been initialized");
            return;
        }

        try{
            var roleList = Arrays.asList(
                    new RoleEntity("ROLE_USER"),
                    new RoleEntity("ROLE_ADMIN"),
                    new RoleEntity("ROLE_SUPER_USER")
            );
            roleRepo.saveAllAndFlush(roleList);
            log.info("Role has been initialized");
        }catch(Exception e){
            log.error("Save role error: {}", e.getMessage());
        }
    }

    public void initUser(){
        if(userRepo.count() > 0) {
            log.info("User has been initialized");
            return;
        }
        List<UserEntity> userList = new ArrayList<>();
        RoleEntity roleUser = roleRepo.findByName("ROLE_USER").orElse(null);
        if(roleUser != null) {
            userList.add(new UserEntity("user", "satu", "user01@gmail.com", encoder.encode("P@ssW0rd32!"), Arrays.asList(roleUser)));
            userList.add(new UserEntity("user", "dua", "user02@gmail.com", encoder.encode("P@ssW0rd32!"), Arrays.asList(roleUser)));
            userList.add(new UserEntity("user", "tiga", "user03@gmail.com", encoder.encode("P@ssW0rd32!"), Arrays.asList(roleUser)));
        }

        RoleEntity roleAdmin = roleRepo.findByName("ROLE_ADMIN").orElse(null);
        if(roleAdmin != null) {
            userList.add(new UserEntity("admin", "satu", "admin01@gmail.com", encoder.encode("P@ssW0rd32!"), Arrays.asList(roleAdmin)));
            userList.add(new UserEntity("admin", "dua", "admin02@gmail.com", encoder.encode("P@ssW0rd32!"), Arrays.asList(roleAdmin)));
            userList.add(new UserEntity("admin", "tiga", "admin03@gmail.com", encoder.encode("P@ssW0rd32!"), Arrays.asList(roleAdmin)));
        }

        RoleEntity roleSuperUser = roleRepo.findByName("ROLE_SUPER_USER").orElse(null);
        if(roleSuperUser != null) {
            userList.add(new UserEntity("super", "user", "super.user@gmail.com", encoder.encode("P@ssW0rd32!"), Arrays.asList(roleSuperUser)));
        }

        try {
            userRepo.saveAllAndFlush(userList);
            log.info("User has been initialized");
        }catch (Exception e){
            log.error("Save user error: {}", e.getMessage());
        }
    }

    public void initCategory(){
        if (!this.categoryRepo.findAll().isEmpty()){
            return;
        }

        List<CategoryEntity> result = Arrays.asList(
                new CategoryEntity("1", "product-1.png", "Smart Phone", "Choose from wide range of smartphones from popular brands", "$99129", 1947),
                new CategoryEntity("2", "product-2.png", "Electronics", "Choose from wide range of electronics from popular brands", "$2512.50", 7283),
                new CategoryEntity("3", "product-3.png", "Clocks", "Choose from wide range of clocks from popular brands", "$1612.34", 2954),
                new CategoryEntity("4", "product-4.png", "Shoes", "Explore the latest shoes from Top brands", "$3612.98", 4940)
        );

        try {
            this.categoryRepo.saveAll(result);
            log.info("Save Category SuccessFully");
        }catch (Exception e){
            log.error("Save Category Failed, Error: {}", e.getMessage());
        }
    }

    public void initProduct(){
        if (!productRepo.findAll().isEmpty()){
            return;
        }
        List<ProductEntity> result = Arrays.asList(
                new ProductEntity("1", "iPhone 14 Pro", 2, 1, 19472, "$999", 665, 3, "product-1.png", "Super Retina XDR display footnote Pro Motion technology"),
                new ProductEntity("2", "Echo Dot (4th Gen)", 2, 0, 72836, "$25.50", 827, 2, "product-2.png", "Echo Dot Smart speaker with Alexa"),
                new ProductEntity("3", "Dohioue Wall Clock", 0, 0, 29540, "$16.34", 804, 2, "product-3.png", "Modern 10 Inch Battery Operated Wall Clocks")
        );

        try {
            productRepo.saveAll(result);
            log.info("Save Product SuccessFully");
        } catch (Exception e) {
            log.error("Save Product Failed, Error: {}", e.getMessage());
        }
    }

}
