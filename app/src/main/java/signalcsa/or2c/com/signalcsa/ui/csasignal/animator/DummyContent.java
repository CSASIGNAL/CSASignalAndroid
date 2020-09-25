package signalcsa.or2c.com.signalcsa.ui.csasignal.animator;


import java.util.ArrayList;
import java.util.Random;

import signalcsa.or2c.com.signalcsa.R;
import signalcsa.or2c.com.signalcsa.ui.csasignal.DummyModel;

public class DummyContent {
    public static ArrayList<ImageGalleryCategoryModel> getImageGalleryAnimalCategories() {
        ArrayList<ImageGalleryCategoryModel> arrayList = new ArrayList<>();
        ImageGalleryCategoryModel imageGalleryCategoryModel = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel.setId(0);
        imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/dogs/14250733433_271362f4ff_h.jpg");
        imageGalleryCategoryModel.setTitle("Dogs");
        imageGalleryCategoryModel.setFavourite(false);
        imageGalleryCategoryModel.setSubcategories(getImageGalleryDogsSubcategory());
        arrayList.add(imageGalleryCategoryModel);
        ImageGalleryCategoryModel imageGalleryCategoryModel2 = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel2.setId(1);
        imageGalleryCategoryModel2.setUrl("http://pengaja.com/uiapptemplate/horses/1242426877_9cdace7a19_b.jpg");
        imageGalleryCategoryModel2.setTitle("Horses");
        imageGalleryCategoryModel2.setFavourite(true);
        imageGalleryCategoryModel2.setSubcategories(getImageGalleryHorsesSubcategory());
        arrayList.add(imageGalleryCategoryModel2);
        ImageGalleryCategoryModel imageGalleryCategoryModel3 = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel3.setId(2);
        imageGalleryCategoryModel3.setUrl("http://pengaja.com/uiapptemplate/cats/15636456045_f99e3a5ccd_k.jpg");
        imageGalleryCategoryModel3.setTitle("Cats");
        imageGalleryCategoryModel3.setFavourite(false);
        imageGalleryCategoryModel3.setSubcategories(getImageGalleryCatsSubcategory());
        arrayList.add(imageGalleryCategoryModel3);
        ImageGalleryCategoryModel imageGalleryCategoryModel4 = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel4.setId(3);
        imageGalleryCategoryModel4.setUrl("http://pengaja.com/uiapptemplate/kangaroos/14018941654_b24dc40edd_k.jpg");
        imageGalleryCategoryModel4.setTitle("Kangaroos");
        imageGalleryCategoryModel4.setFavourite(true);
        imageGalleryCategoryModel4.setSubcategories(getImageGalleryKangarooSubcategory());
        arrayList.add(imageGalleryCategoryModel4);
        ImageGalleryCategoryModel imageGalleryCategoryModel5 = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel5.setId(4);
        imageGalleryCategoryModel5.setUrl("http://pengaja.com/uiapptemplate/foxes/2741843163_5aefaae694_b.jpg");
        imageGalleryCategoryModel5.setTitle("Foxes");
        imageGalleryCategoryModel5.setFavourite(false);
        imageGalleryCategoryModel5.setSubcategories(getImageGalleryFoxesSubcategory());
        arrayList.add(imageGalleryCategoryModel5);
        ImageGalleryCategoryModel imageGalleryCategoryModel6 = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel6.setId(5);
        imageGalleryCategoryModel6.setUrl("http://pengaja.com/uiapptemplate/eagles/12111485434_015bcf17e0_k.jpg");
        imageGalleryCategoryModel6.setTitle("Eagles");
        imageGalleryCategoryModel6.setFavourite(true);
        imageGalleryCategoryModel6.setSubcategories(getImageGalleryEaglesSubcategory());
        arrayList.add(imageGalleryCategoryModel6);
        ImageGalleryCategoryModel imageGalleryCategoryModel7 = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel7.setId(6);
        imageGalleryCategoryModel7.setUrl("http://pengaja.com/uiapptemplate/squirrels/12683899725_ec12a691c5_k.jpg");
        imageGalleryCategoryModel7.setTitle("Squirrels");
        imageGalleryCategoryModel7.setFavourite(true);
        imageGalleryCategoryModel7.setSubcategories(getImageGallerySquirrelsSubcategory());
        arrayList.add(imageGalleryCategoryModel7);
        if (new Random().nextBoolean()) {
            ImageGalleryCategoryModel imageGalleryCategoryModel8 = new ImageGalleryCategoryModel();
            imageGalleryCategoryModel8.setId(7);
            imageGalleryCategoryModel8.setUrl("http://pengaja.com/uiapptemplate/bears/14316604273_778ccdac73_b.jpg");
            imageGalleryCategoryModel8.setTitle("Bears");
            imageGalleryCategoryModel8.setFavourite(false);
            imageGalleryCategoryModel8.setSubcategories(getImageGalleryBearsSubcategory());
            arrayList.add(imageGalleryCategoryModel8);
        }
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryDogsSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setTitle("Dog 1");
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/dogs/14250733433_271362f4ff_h.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setTitle("Dog 2");
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/dogs/174085592_c0b7e5076f_o.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setTitle("Dog 3");
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/dogs/174097822_6c0aae32e1_o.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setTitle("Dog 4");
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/dogs/4733823624_a758c8e8e9_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setTitle("Dog 5");
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/dogs/4939588185_4dc4fa8cca_b.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setTitle("Dog 6");
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/dogs/6698150783_161b18182e_b.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel7 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel7.setId(6);
        imageGallerySubcategoryModel7.setTitle("Dog 7");
        imageGallerySubcategoryModel7.setUrl("http://pengaja.com/uiapptemplate/dogs/6787786882_4e74d00628_b.jpg");
        arrayList.add(imageGallerySubcategoryModel7);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel8 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel8.setId(7);
        imageGallerySubcategoryModel8.setTitle("Dog 8");
        imageGallerySubcategoryModel8.setUrl("http://pengaja.com/uiapptemplate/dogs/8206632393_36622366c6_k.jpg");
        arrayList.add(imageGallerySubcategoryModel8);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryHorsesSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/horses/1242426877_9cdace7a19_b.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/horses/2795764001_1e899c8560_b.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/horses/3571783564_b02308c31c_b.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/horses/3724307231_7077e8a5da_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/horses/548518280_b408f3d2a5_o.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/horses/6990704333_abff211880_b.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel7 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel7.setId(6);
        imageGallerySubcategoryModel7.setUrl("http://pengaja.com/uiapptemplate/horses/8621170742_15cd967dc8_b.jpg");
        arrayList.add(imageGallerySubcategoryModel7);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel8 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel8.setId(7);
        imageGallerySubcategoryModel8.setUrl("http://pengaja.com/uiapptemplate/horses/9581032545_e388ee7d3e_b.jpg");
        arrayList.add(imageGallerySubcategoryModel8);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryCatsSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/cats/15636456045_f99e3a5ccd_k.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/cats/3285731954_a31261bd38_o.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/cats/560380352_8b58b0611c_o.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/cats/6131811835_b7cdb594f3_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/cats/6944735673_7d201cbb98_k.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/cats/8470085922_ed703dcda3_b.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel7 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel7.setId(6);
        imageGallerySubcategoryModel7.setUrl("http://pengaja.com/uiapptemplate/cats/8854205418_3739d5b3e9_h.jpg");
        arrayList.add(imageGallerySubcategoryModel7);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel8 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel8.setId(7);
        imageGallerySubcategoryModel8.setUrl("http://pengaja.com/uiapptemplate/cats/9308613838_de3df521b0_b.jpg");
        arrayList.add(imageGallerySubcategoryModel8);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel9 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel9.setId(8);
        imageGallerySubcategoryModel9.setUrl("http://pengaja.com/uiapptemplate/cats/9657345685_b680cd813b_k.jpg");
        arrayList.add(imageGallerySubcategoryModel9);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryKangarooSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setTitle("Kangaroo 1");
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/kangaroos/14018941654_b24dc40edd_k.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setTitle("Kangaroo 2");
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/kangaroos/4849609708_06a24058ec_b.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setTitle("Kangaroo 3");
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/kangaroos/4901737404_cf375a44d3_b.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setTitle("Kangaroo 4");
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/kangaroos/4962092282_15a076cb8c_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setTitle("Kangaroo 5");
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/kangaroos/5366854530_35d6de81c2_b.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setTitle("Kangaroo 6");
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/kangaroos/7643187732_3753aa9b70_k.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel7 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel7.setId(6);
        imageGallerySubcategoryModel7.setTitle("Kangaroo 7");
        imageGallerySubcategoryModel7.setUrl("http://pengaja.com/uiapptemplate/kangaroos/8275651371_0e5e6bffc4_k.jpg");
        arrayList.add(imageGallerySubcategoryModel7);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel8 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel8.setId(7);
        imageGallerySubcategoryModel8.setTitle("Kangaroo 8");
        imageGallerySubcategoryModel8.setUrl("http://pengaja.com/uiapptemplate/kangaroos/8672908837_1ec6c9c967_b.jpg");
        arrayList.add(imageGallerySubcategoryModel8);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryFoxesSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setTitle("Fox 1");
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/foxes/2741843163_5aefaae694_b.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/foxes/5461393397_b7bbff4c87_b.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setTitle("Fox 3");
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/foxes/5872864880_b1739e6e76_b.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setTitle("Fox 4");
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/foxes/6904712695_751bb39e16_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/foxes/6904714319_c4dbbb2b14_b.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/foxes/6977256115_af1011fbfb_h.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel7 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel7.setId(6);
        imageGallerySubcategoryModel7.setTitle("Fox 7");
        imageGallerySubcategoryModel7.setUrl("http://pengaja.com/uiapptemplate/foxes/7132259891_878e6513c4_k.jpg");
        arrayList.add(imageGallerySubcategoryModel7);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel8 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel8.setId(7);
        imageGallerySubcategoryModel8.setTitle("Fox 8");
        imageGallerySubcategoryModel8.setUrl("http://pengaja.com/uiapptemplate/foxes/7238361098_5d244ea023_b.jpg");
        arrayList.add(imageGallerySubcategoryModel8);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryEaglesSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setTitle("Eagles 1");
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/eagles/12111485434_015bcf17e0_k.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setTitle("Eagles 2");
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/eagles/12387369564_ee3e9810f3_k.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setTitle("Eagles");
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/eagles/3358262896_8a623dc7ca_b.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/eagles/6130420503_b5516d49e4_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/eagles/7924818318_d4f0355bdd_k.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setTitle("Eagles 6");
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/eagles/8626880581_7308f6a8a7_k.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel7 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel7.setId(6);
        imageGallerySubcategoryModel7.setTitle("Eagles 7");
        imageGallerySubcategoryModel7.setUrl("http://pengaja.com/uiapptemplate/eagles/9395841437_95035aed96_k.jpg");
        arrayList.add(imageGallerySubcategoryModel7);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGallerySquirrelsSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setTitle("Squirrels 1");
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/squirrels/12683899725_ec12a691c5_k.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/squirrels/12935575784_bcb43443f9_b.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/squirrels/15365307348_82551c3cb6_h.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/squirrels/2438938256_655ed4f254_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/squirrels/5194088091_f8af189189_b.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/squirrels/5339749381_f1c0a3040b_b.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel7 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel7.setId(6);
        imageGallerySubcategoryModel7.setTitle("Squirrels 7");
        imageGallerySubcategoryModel7.setUrl("http://pengaja.com/uiapptemplate/squirrels/6359846085_c88e231c01_b.jpg");
        arrayList.add(imageGallerySubcategoryModel7);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel8 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel8.setId(7);
        imageGallerySubcategoryModel8.setTitle("Squirrels 8");
        imageGallerySubcategoryModel8.setUrl("http://pengaja.com/uiapptemplate/squirrels/6583159839_0ba9c33a75_b.jpg");
        arrayList.add(imageGallerySubcategoryModel8);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryBearsSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/bears/14316604273_778ccdac73_b.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/bears/14567666406_61df9c0d52_k.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/bears/15665160302_f87492c246_k.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/bears/3946668599_90958b634c_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/bears/5396353993_d8bcf19d5e_b.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/bears/6346303116_7f3d463a68_b.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel7 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel7.setId(6);
        imageGallerySubcategoryModel7.setUrl("http://pengaja.com/uiapptemplate/bears/8568153824_ae2b3d3a02_k.jpg");
        arrayList.add(imageGallerySubcategoryModel7);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel8 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel8.setId(7);
        imageGallerySubcategoryModel8.setUrl("http://pengaja.com/uiapptemplate/bears/8797595259_e99bf75d2e_k.jpg");
        arrayList.add(imageGallerySubcategoryModel8);
        return arrayList;
    }

    public static ArrayList<ImageGalleryCategoryModel> getImageGalleryMusicCategories() {
        ArrayList<ImageGalleryCategoryModel> arrayList = new ArrayList<>();
        ImageGalleryCategoryModel imageGalleryCategoryModel = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel.setId(0);
        imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/violins/147587554_205e3ed653_o.jpg");
        imageGalleryCategoryModel.setTitle("Violins");
        imageGalleryCategoryModel.setFavourite(true);
        imageGalleryCategoryModel.setSubcategories(getImageGalleryViolinsSubcategory());
        arrayList.add(imageGalleryCategoryModel);
        ImageGalleryCategoryModel imageGalleryCategoryModel2 = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel2.setId(1);
        imageGalleryCategoryModel2.setUrl("http://pengaja.com/uiapptemplate/drums/14258762970_33f3a049ed_b.jpg");
        imageGalleryCategoryModel2.setTitle("Drums");
        imageGalleryCategoryModel2.setFavourite(false);
        imageGalleryCategoryModel2.setSubcategories(getImageGalleryDrumsSubcategory());
        arrayList.add(imageGalleryCategoryModel2);
        ImageGalleryCategoryModel imageGalleryCategoryModel3 = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel3.setId(2);
        imageGalleryCategoryModel3.setUrl("http://pengaja.com/uiapptemplate/saxophones/3022692180_fd02682a44_b.jpg");
        imageGalleryCategoryModel3.setTitle("Saxophones");
        imageGalleryCategoryModel3.setFavourite(false);
        imageGalleryCategoryModel3.setSubcategories(getImageGallerySaxophonesSubcategory());
        arrayList.add(imageGalleryCategoryModel3);
        ImageGalleryCategoryModel imageGalleryCategoryModel4 = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel4.setId(3);
        imageGalleryCategoryModel4.setUrl("http://pengaja.com/uiapptemplate/trumpets/14163752896_453a37b84a_h.jpg");
        imageGalleryCategoryModel4.setTitle("Trumpets");
        imageGalleryCategoryModel4.setFavourite(true);
        imageGalleryCategoryModel4.setSubcategories(getImageGalleryTrumpetsSubcategory());
        arrayList.add(imageGalleryCategoryModel4);
        ImageGalleryCategoryModel imageGalleryCategoryModel5 = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel5.setId(4);
        imageGalleryCategoryModel5.setUrl("http://pengaja.com/uiapptemplate/pianos/14287113341_fe14885b70_b.jpg");
        imageGalleryCategoryModel5.setTitle("Pianos");
        imageGalleryCategoryModel5.setFavourite(true);
        imageGalleryCategoryModel5.setSubcategories(getImageGalleryPianosSubcategory());
        arrayList.add(imageGalleryCategoryModel5);
        ImageGalleryCategoryModel imageGalleryCategoryModel6 = new ImageGalleryCategoryModel();
        imageGalleryCategoryModel6.setId(5);
        imageGalleryCategoryModel6.setUrl("http://pengaja.com/uiapptemplate/accordions/153706234_c473e8eabd_o.jpg");
        imageGalleryCategoryModel6.setTitle("Accordions");
        imageGalleryCategoryModel6.setFavourite(false);
        imageGalleryCategoryModel6.setSubcategories(getImageGalleryAccordionsSubcategory());
        arrayList.add(imageGalleryCategoryModel6);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryViolinsSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setTitle("Violin 1");
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/violins/147587554_205e3ed653_o.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setTitle("Violin 2");
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/violins/2322113757_808c904f04_o.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setTitle("Violin 3");
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/violins/2323048092_b6c70654ef_o.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setTitle("Violin 4");
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/violins/2348623142_af7802400f_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setTitle("Violin 5");
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/violins/459221457_09e40e82a8_b.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setTitle("Violin 6");
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/violins/5950552903_7dbea63895_b.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryDrumsSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setTitle("Drum 1");
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/drums/14258762970_33f3a049ed_b.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setTitle("Drum 2");
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/drums/2419154841_a4c2015605_b.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setTitle("Drum 3");
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/drums/6500936951_bf8d21a4b7_b.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/drums/7587609934_f90d316fa0_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/drums/7672718592_ca4ccf7315_b.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/drums/8229110151_3c963f6a8d_k.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGallerySaxophonesSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/saxophones/3022692180_fd02682a44_b.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/saxophones/4268421378_e2d3ecdf1b_o.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/saxophones/4586115189_d4886a2118_b.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/saxophones/5823606898_77db8827b1_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/saxophones/7807389560_57b1d5b5f8_k.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/saxophones/870265218_716ebe2cb8_o.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryTrumpetsSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setTitle("Trumpet 1");
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/trumpets/14163752896_453a37b84a_h.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setTitle("Trumpet 2");
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/trumpets/2531134817_ba97791524_b.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setTitle("Trumpet 3");
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/trumpets/4867822712_1b1d3da2cd_b.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setTitle("Trumpet 4");
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/trumpets/4949712803_7fc832d2cc_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setTitle("Trumpet 5");
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/trumpets/6186270505_cc834a94c6_o.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setTitle("Trumpet 6");
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/trumpets/7865792422_ef00cb7840_k.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel7 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel7.setId(6);
        imageGallerySubcategoryModel7.setTitle("Trumpet 7");
        imageGallerySubcategoryModel7.setUrl("http://pengaja.com/uiapptemplate/trumpets/8044715752_9855063570_k.jpg");
        arrayList.add(imageGallerySubcategoryModel7);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryPianosSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setTitle("Piano 1");
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/pianos/14287113341_fe14885b70_b.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/pianos/5052063297_61b6386db5_b.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setTitle("Piano 3");
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/pianos/5200112333_502355c045_b.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/pianos/5637747696_42cba72967_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/pianos/7310209818_537dd46419_b.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setTitle("Piano 6");
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/pianos/8247668743_36fcf1f4bb_b.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        return arrayList;
    }

    public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryAccordionsSubcategory() {
        ArrayList<ImageGallerySubcategoryModel> arrayList = new ArrayList<>();
        ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel.setId(0);
        imageGallerySubcategoryModel.setTitle("Accordion 1");
        imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/accordions/153706234_c473e8eabd_o.jpg");
        arrayList.add(imageGallerySubcategoryModel);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel2.setId(1);
        imageGallerySubcategoryModel2.setTitle("Accordion 2");
        imageGallerySubcategoryModel2.setUrl("http://pengaja.com/uiapptemplate/accordions/2681657661_177a5edbc5_b.jpg");
        arrayList.add(imageGallerySubcategoryModel2);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel3.setId(2);
        imageGallerySubcategoryModel3.setTitle("Accordion 3");
        imageGallerySubcategoryModel3.setUrl("http://pengaja.com/uiapptemplate/accordions/3369363243_94fb76891d_b.jpg");
        arrayList.add(imageGallerySubcategoryModel3);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel4 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel4.setId(3);
        imageGallerySubcategoryModel4.setTitle("Accordion 4");
        imageGallerySubcategoryModel4.setUrl("http://pengaja.com/uiapptemplate/accordions/5316360932_719617fa1d_b.jpg");
        arrayList.add(imageGallerySubcategoryModel4);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel5 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel5.setId(4);
        imageGallerySubcategoryModel5.setTitle("Accordion 5");
        imageGallerySubcategoryModel5.setUrl("http://pengaja.com/uiapptemplate/accordions/6151326630_349b892d5a_b.jpg");
        arrayList.add(imageGallerySubcategoryModel5);
        ImageGallerySubcategoryModel imageGallerySubcategoryModel6 = new ImageGallerySubcategoryModel();
        imageGallerySubcategoryModel6.setId(5);
        imageGallerySubcategoryModel6.setTitle("Accordion 6");
        imageGallerySubcategoryModel6.setUrl("http://pengaja.com/uiapptemplate/accordions/7607076588_593e509440_h.jpg");
        arrayList.add(imageGallerySubcategoryModel6);
        return arrayList;
    }

    public static ArrayList<DummyModel> getDummyModelList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/profileimages/0.jpg", "Isaac Reid", R.string.fontello_heart_empty);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/profileimages/1.jpg", "Jason Graham", R.string.fontello_heart_empty);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/profileimages/2.jpg", "Abigail Ross", R.string.fontello_heart_empty);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/profileimages/3.jpg", "Justin Rutherford", R.string.fontello_heart_empty);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/profileimages/4.jpg", "Nicholas Henderson", R.string.fontello_heart_empty);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/profileimages/5.jpg", "Elizabeth Mackenzie", R.string.fontello_heart_empty);
        arrayList.add(dummyModel6);
        DummyModel dummyModel7 = new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/profileimages/6.jpg", "Melanie Ferguson", R.string.fontello_heart_empty);
        arrayList.add(dummyModel7);
        DummyModel dummyModel8 = new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/profileimages/7.jpg", "Fiona Kelly", R.string.fontello_heart_empty);
        arrayList.add(dummyModel8);
        DummyModel dummyModel9 = new DummyModel(8, "http://pengaja.com/uiapptemplate/newphotos/profileimages/8.jpg", "Nicholas King", R.string.fontello_heart_empty);
        arrayList.add(dummyModel9);
        DummyModel dummyModel10 = new DummyModel(9, "http://pengaja.com/uiapptemplate/newphotos/profileimages/9.jpg", "Victoria Mitchell", R.string.fontello_heart_empty);
        arrayList.add(dummyModel10);
        DummyModel dummyModel11 = new DummyModel(10, "http://pengaja.com/uiapptemplate/newphotos/profileimages/10.jpg", "Sophie Lyman", R.string.fontello_heart_empty);
        arrayList.add(dummyModel11);
        DummyModel dummyModel12 = new DummyModel(11, "http://pengaja.com/uiapptemplate/newphotos/profileimages/11.jpg", "Carl Ince", R.string.fontello_heart_empty);
        arrayList.add(dummyModel12);
        DummyModel dummyModel13 = new DummyModel(12, "http://pengaja.com/uiapptemplate/newphotos/profileimages/12.jpg", "Michelle Slater", R.string.fontello_heart_empty);
        arrayList.add(dummyModel13);
        DummyModel dummyModel14 = new DummyModel(13, "http://pengaja.com/uiapptemplate/newphotos/profileimages/13.jpg", "Ryan Mathis", R.string.fontello_heart_empty);
        arrayList.add(dummyModel14);
        DummyModel dummyModel15 = new DummyModel(14, "http://pengaja.com/uiapptemplate/newphotos/profileimages/14.jpg", "Julia Grant", R.string.fontello_heart_empty);
        arrayList.add(dummyModel15);
        DummyModel dummyModel16 = new DummyModel(15, "http://pengaja.com/uiapptemplate/newphotos/profileimages/15.jpg", "Hannah Martin", R.string.fontello_heart_empty);
        arrayList.add(dummyModel16);
        return arrayList;
    }

    public static ArrayList<DummyModel> getDummyModelSwipeToDissmissTravelList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/0.jpg", "Monument walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/1.jpg", "River walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/2.jpg", "City walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/3.jpg", "Park walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/4.jpg", "Vilage walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/5.jpg", "Lake walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel6);
        DummyModel dummyModel7 = new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/6.jpg", "Castle walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel7);
        DummyModel dummyModel8 = new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/7.jpg", "Beach walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel8);
        return arrayList;
    }

    public static ArrayList<DummyModel> getDummyModelSwipeToDissmissSocialList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/profileimages/3.jpg", "Monument walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/profileimages/4.jpg", "River walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/profileimages/5.jpg", "City walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/profileimages/6.jpg", "Park walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/profileimages/7.jpg", "Vilage walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/profileimages/8.jpg", "Lake walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel6);
        DummyModel dummyModel7 = new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/profileimages/9.jpg", "Castle walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel7);
        DummyModel dummyModel8 = new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/profileimages/10.jpg", "Beach walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel8);
        return arrayList;
    }

    public static ArrayList<DummyModel> getDummyModelGoogleCardsTravelList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/0.jpg", "Monument walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/1.jpg", "Diving in sea", R.string.fontello_heart_empty);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/2.jpg", "Fall in Prague", R.string.fontello_heart_empty);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/3.jpg", "San Francisco tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/4.jpg", "Geyser on Island", R.string.fontello_heart_empty);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/5.jpg", "Old house tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel6);
        DummyModel dummyModel7 = new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/6.jpg", "Hitchhike", R.string.fontello_heart_empty);
        arrayList.add(dummyModel7);
        DummyModel dummyModel8 = new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/7.jpg", "Beach walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel8);
        return arrayList;
    }

    public static ArrayList<DummyModel> getDummyModelDragAndDropTravelList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/0.jpg", "Monument walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/1.jpg", "River walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/2.jpg", "City walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/3.jpg", "Park walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/4.jpg", "Vilage walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/5.jpg", "Lake walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel6);
        DummyModel dummyModel7 = new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/6.jpg", "Castle walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel7);
        DummyModel dummyModel8 = new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/7.jpg", "Beach walk tour", R.string.fontello_heart_empty);
        arrayList.add(dummyModel8);
        return arrayList;
    }

    public static ArrayList<DummyModel> getDummyModelDragAndDropShopList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/shop/0.jpg", "Black Shirt", R.string.fontello_heart_empty);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/shop/1.jpg", "Black Sweater", R.string.fontello_heart_empty);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/shop/2.jpg", "Shirt", R.string.fontello_heart_empty);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/shop/3.jpg", "White Shirt", R.string.fontello_heart_empty);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/shop/4.jpg", "White T shirt", R.string.fontello_heart_empty);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/shop/5.jpg", "T shirt", R.string.fontello_heart_empty);
        arrayList.add(dummyModel6);
        DummyModel dummyModel7 = new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/shop/6.jpg", "Hoodies", R.string.fontello_heart_empty);
        arrayList.add(dummyModel7);
        return arrayList;
    }

    public static ArrayList<DummyModel> getDummyModelListSocial() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/0.jpg", "Jane Smith", R.string.fontello_heart_empty);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/1.jpg", "Jane Smith", R.string.fontello_heart_empty);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/2.jpg", "Jane Smith", R.string.fontello_heart_empty);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/3.jpg", "Jane Smith", R.string.fontello_heart_empty);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/4.jpg", "Jane Smith", R.string.fontello_heart_empty);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/5.jpg", "Jane Smith", R.string.fontello_heart_empty);
        arrayList.add(dummyModel6);
        DummyModel dummyModel7 = new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/6.jpg", "Jane Smith", R.string.fontello_heart_empty);
        arrayList.add(dummyModel7);
        DummyModel dummyModel8 = new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/7.jpg", "Jane Smith", R.string.fontello_heart_empty);
        arrayList.add(dummyModel8);
        return arrayList;
    }

    public static ArrayList<DummyModel> getDummyModelListTravel() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "", "Joe's restaurant", R.string.fontello_heart_empty);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "", "Good restaurant", R.string.fontello_heart_empty);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "", "Express restaurant", R.string.fontello_heart_empty);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "", "Mine restaurant", R.string.fontello_heart_empty);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "", "Love restaurant", R.string.fontello_heart_empty);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "", "Story restaurant", R.string.fontello_heart_empty);
        arrayList.add(dummyModel6);
        return arrayList;
    }

    public static ArrayList<DummyModel> getTravelDummyList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "", "Where To Go", R.string.material_icon_go);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "", "Where To Sleep", R.string.material_icon_sleep);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "", "Where To Eat", R.string.material_icon_eat);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "", "Where To Drink", R.string.material_icon_drink);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "", "Where To Party", R.string.material_icon_party);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "", "Where To Play", R.string.material_icon_play);
        arrayList.add(dummyModel6);
        DummyModel dummyModel7 = new DummyModel(6, "", "Where To Shop", R.string.material_icon_shop);
        arrayList.add(dummyModel7);
        return arrayList;
    }

    public static ArrayList<DummyModel> getSocialDummyList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "", "Friends", R.string.material_icon_account);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "", "Enemies", R.string.material_icon_account);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "", "Natural", R.string.material_icon_account);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "", "Family", R.string.material_icon_account);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "", "Guests", R.string.material_icon_account);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "", "Students", R.string.material_icon_account);
        arrayList.add(dummyModel6);
        return arrayList;
    }

    public static ArrayList<DummyModel> getDrawerShopDummyList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "", "Categories", R.string.material_icon_headline);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "", "Discounts", R.string.material_icon_dollar);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "", "My cart", R.string.material_icon_cart);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "", "My wishlist", R.string.material_icon_star);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "", "My Account", R.string.material_icon_account);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(4, "", "Settings", R.string.material_icon_settings);
        arrayList.add(dummyModel6);
        return arrayList;
    }

    public static ArrayList<DummyModel> getDrawerMediaDummyList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "", "Albums", R.string.material_icon_headphones);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "", "Artist", R.string.material_icon_human);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "", "Playlist", R.string.material_icon_headline);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "", "Stream", R.string.material_icon_soundcloud);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "", "Settings", R.string.material_icon_statistics);
        arrayList.add(dummyModel5);
        return arrayList;
    }

    public static ArrayList<DummyModel> getMediaDummyList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "", "", R.string.material_icon_go);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "", "", R.string.material_icon_sleep);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "", "", R.string.material_icon_eat);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "", "", R.string.material_icon_drink);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "", "", R.string.material_icon_party);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "", "", R.string.material_icon_play);
        arrayList.add(dummyModel6);
        DummyModel dummyModel7 = new DummyModel(6, "", "", R.string.material_icon_shop);
        arrayList.add(dummyModel7);
        return arrayList;
    }

    public static ArrayList<DummyModel> getShoppingDummyList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "", "", R.string.material_icon_go);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "", "", R.string.material_icon_sleep);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "", "", R.string.material_icon_eat);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "", "", R.string.material_icon_drink);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "", "", R.string.material_icon_party);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "", "", R.string.material_icon_play);
        arrayList.add(dummyModel6);
        DummyModel dummyModel7 = new DummyModel(6, "", "", R.string.material_icon_shop);
        arrayList.add(dummyModel7);
        return arrayList;
    }

    public static ArrayList<DummyModel> getNewsDummyList() {
        ArrayList<DummyModel> arrayList = new ArrayList<>();
        DummyModel dummyModel = new DummyModel(0, "", "", R.string.material_icon_go);
        arrayList.add(dummyModel);
        DummyModel dummyModel2 = new DummyModel(1, "", "", R.string.material_icon_sleep);
        arrayList.add(dummyModel2);
        DummyModel dummyModel3 = new DummyModel(2, "", "", R.string.material_icon_eat);
        arrayList.add(dummyModel3);
        DummyModel dummyModel4 = new DummyModel(3, "", "", R.string.material_icon_drink);
        arrayList.add(dummyModel4);
        DummyModel dummyModel5 = new DummyModel(4, "", "", R.string.material_icon_party);
        arrayList.add(dummyModel5);
        DummyModel dummyModel6 = new DummyModel(5, "", "", R.string.material_icon_play);
        arrayList.add(dummyModel6);
        DummyModel dummyModel7 = new DummyModel(6, "", "", R.string.material_icon_shop);
        arrayList.add(dummyModel7);
        return arrayList;
    }
}
