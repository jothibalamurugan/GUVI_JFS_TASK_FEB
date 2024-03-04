package com.JSFTask4;

public class T2Voter {
        private int voterId;
        private String name;
        private int age;

        public T2Voter(int voterId, String name, int age) throws T2InvalidAgeException {
            if (age < 18) {
                throw new T2InvalidAgeException("Invalid age for voter " + name);
            }
            this.voterId = voterId;
            this.name = name;
            this.age = age;
        }

        // Getter methods
        public int getVoterId() {
            return voterId;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
    public String toString()
        {
            return "Student{" +
                    "voterId=" + voterId +
                    ", Name='" + name + '\'' +
                    ", Age=" + age +
                    '}';
    }

}
