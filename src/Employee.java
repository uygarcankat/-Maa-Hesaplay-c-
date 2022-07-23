public class Employee {


    String name ; // Çalışanın adı ve soyadı
    int salary ; // Çalışanın maaşı
    int workHours ; // Haftalık çalışma saati
    int hireYear;    //  İşe başlangıç yılı



        Employee(String name, int  salary,int workHours,int hireYear){

        this.name=name;
        this.salary= salary;
        this.workHours=workHours;
        this.hireYear=hireYear;


    }



    double tax(){

        if(this.salary<1000){

            System.out.println("Vergi ödemesi bulunmamaktadır");

        }

        else if(this.salary>=1000){

        double tax= (3*this.salary)/100.0;

        return tax;


        }

        else{

            System.out.println("Yanlış maaş girişi yaptınız");
        }

        return 0;

    }


    double bonus() {


        double bonus = 0;
        if (this.workHours > 40) {

            bonus = workHours * 30;

        }

        return bonus;

    }
        int raiseSalary() {

            int zam =0;

            if (hireYear > 2011) {

                 zam = (salary * 5) / 100;

            } else if (hireYear < 2012 && hireYear> 2001) {

                 zam = (salary * 10) / 100;


            } else if (hireYear < 2002) {


                 zam = (salary * 15) / 100;


            }

           return zam;

        }
            public String toString(){

                double bonus_vergi= bonus()-tax();
                double net= bonus_vergi+ this.salary;
                double toplam= this.salary+ raiseSalary();

                System.out.println("Adı :" + this.name + "\n" + "Maaşı :" + this.salary +
                        "\n"+ "Çalışma Saati :" +  this.workHours + "\n" +
                        "Başlangıç Yılı :" + this.hireYear + "\n" +  "Vergi :" + tax() + "\n" +
                        "Bonus :" +  bonus() + "\n" + "Maaş Artışı :" +raiseSalary() + "\n" +
                        "Vergi ve Bonuslar ile birlikte maaş :" +  net + "\n" + "Toplam Maaş :" + toplam);


                return null;
            }




}


