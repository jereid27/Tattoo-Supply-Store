package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    /*Created an if statement to check if there was 0 in each repository*/
    /*Added sample inventory and saved it to the repository*/
    @Override
    public void run(String... args) throws Exception {


        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        Set<String> existingParts = new HashSet<>();

        for (OutsourcedPart part : outsourcedParts) {
            existingParts.add(part.getName());

        }
        if (outsourcedPartRepository.count() == 0 && productRepository.count() == 0) {
            OutsourcedPart c = new OutsourcedPart();
            c.setCompanyName("Lucky Supply");
            c.setName("Coils");
            c.setInv(100);
            c.setPrice(10.0);
            c.setId(10L);
            c.setMinInv(1);
            c.setMaxInv(100);


            OutsourcedPart s = new OutsourcedPart();
            s.setCompanyName("Jerry Sailor Supply");
            s.setName("Springs");
            s.setInv(100);
            s.setPrice(5.0);
            s.setId(11L);
            s.setMinInv(1);
            s.setMaxInv(100);


            OutsourcedPart ca = new OutsourcedPart();
            ca.setCompanyName("PinKing Supply");
            ca.setName("Capacitors");
            ca.setInv(100);
            ca.setPrice(10.0);
            ca.setId(12L);
            ca.setMinInv(1);
            ca.setMaxInv(100);


            OutsourcedPart o = new OutsourcedPart();
            o.setCompanyName("SoulTat Supply");
            o.setName("O-Rings");
            o.setInv(100);
            o.setPrice(5.0);
            o.setId(13L);
            o.setMinInv(1);
            o.setMaxInv(100);


            OutsourcedPart f = new OutsourcedPart();
            f.setCompanyName("InkSolid");
            f.setName("Frames");
            f.setInv(100);
            f.setPrice(10.0);
            f.setId(10L);
            f.setMinInv(1);
            f.setMaxInv(100);


            /*Commented out the code here*/

        /*OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Coils"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());*/

            List<OutsourcedPart> outsourcedPartsToAdd = List.of(c, s, ca, o, f);

            for (OutsourcedPart part : outsourcedPartsToAdd) {
                if (existingParts.contains(part.getName())) {
                    OutsourcedPart multipack = new OutsourcedPart();
                    multipack.setCompanyName(part.getCompanyName());
                    multipack.setName(part.getName() + " Multi-pack");
                    multipack.setInv(part.getInv());
                    multipack.setPrice(part.getPrice());
                    multipack.setId(part.getId());

                    outsourcedPartRepository.save(multipack);
                    System.out.println(part.getName() + " " + part.getCompanyName());
                } else {
                    outsourcedPartRepository.save(part);
                    System.out.println(part.getName() + " " + part.getCompanyName());
                }
            }


            /*Created new sample inventory for the products*/
            Product pumba = new Product("Pumba Machine", 120.0, 10);
            Product soldier = new Product("Soldier Machine", 120.0, 10);
            Product tatWiz = new Product("Wizard Machine", 120.0, 10);
            Product cleanrock = new Product("Clean Machine", 120.0, 10);
            Product jasper = new Product("Jasper Machine", 120.0, 10);

            productRepository.save(pumba);
            productRepository.save(soldier);
            productRepository.save(tatWiz);
            productRepository.save(cleanrock);
            productRepository.save(jasper);


            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());

        }
    }
}
