package org.dynamic;

import org.dynamic.data.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 */
public class DummyInputDataSets {

    public static Input deserialize(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);
        int availableImpressions = Integer.parseInt(br.readLine());
        String line;
        List<Company> companies = new ArrayList<Company>();
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            Company company = new Company(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
            companies.add(company);
        }
        return new Input(availableImpressions, companies);
    }

    private final static Random rand = new Random();

    public static Input generateRandom(int nCompanies, int totalImpressions, int maxRevenuePerCompany, int maxWeightPerCompany) {
        List<Company> companies = new ArrayList<>(nCompanies);
        for (int i = 0; i < nCompanies; ++i) {
            companies.add(new Company(i + "", randomNumber(maxWeightPerCompany), randomNumber(maxRevenuePerCompany)));
        }
        return new Input(totalImpressions, companies);
    }

    private static int randomNumber(int max) {
        return rand.nextInt(max - 1) + 1;
    }

    public static Input dataSet6() {
        List<Company> companies = new ArrayList<>(10);
        companies.add(new Company("1", 1, 2));
        companies.add(new Company("2", 2, 3));
        companies.add(new Company("3", 3, 4));
        companies.add(new Company("4", 11, 20));
        companies.add(new Company("5", 19, 32));
        companies.add(new Company("6", 32, 2));
        companies.add(new Company("7", 122, 42));
        companies.add(new Company("8", 53, 27));
        companies.add(new Company("9", 27, 53));
        companies.add(new Company("10", 1, 2));
        return new Input(1000000, companies);
    }

    public static Input dataSet7() {
        List<Company> companies = new ArrayList<>(10);
        companies.add(new Company("1", 1, 0));
        companies.add(new Company("2", 2, 0));
        companies.add(new Company("3", 3, 0));
        companies.add(new Company("4", 11, 0));
        return new Input(1000000, companies);
    }

    public static Input dataSet1() {
        try {
            return deserialize(
                new StringReader(
                    "32356000\n" +
                        "Acme,2000000,200\n" +
                        "Lorem,3500000,400\n" +
                        "Ipsum,2300000,210\n" +
                        "Dolor,8000000,730\n" +
                        "SIT,10000000,1000\n" +
                        "Amet,1500000,160\n" +
                        "Mauris,1000000,100"));
        } catch (IOException e) {
            //ignore
        }
        return null;
    }

    public static Input dataSet5() {
        try {
            return deserialize(
                new StringReader(
                    "1000000\n" +
                        "Acme,1,2\n" +
                        "Lorem,2,4\n" +
                        "Ipsum,3,2\n" +
                        "Dolor,4,7\n" +
                        "SIT,5,10\n" +
                        "Amet,6,10\n" +
                        "Mauris,7,10"));
        } catch (IOException e) {
            //ignore
        }
        return null;
    }

    public static Output dataSetOutput1() {
        OutputMetadata metadata = new OutputMetadata(32000000, 3620);
        List<OutputItem> out = new ArrayList<>();
        out.add(new OutputItem("Acme", 0, 0, 0));
        out.add(new OutputItem("Lorem", 8, 28000000, 3200));
        out.add(new OutputItem("Ipsum", 0, 0, 0));
        out.add(new OutputItem("Dolor", 0, 0, 0));
        out.add(new OutputItem("SIT", 0, 0, 0));
        out.add(new OutputItem("Amet", 2, 3000000, 320));
        out.add(new OutputItem("Mauris", 1, 1000000, 100));
        return new Output(out, metadata);
    }

    public static Input dataSet4() {
        try {
            return deserialize(
                new StringReader(
                    "1000\n" +
                        "Acme,2,20\n" +
                        "Lorem,3,40\n" +
                        "Ipsum,4,210\n" +
                        "Dolor,10,730\n" +
                        "SIT,30,1000\n" +
                        "1Amet,50,160\n" +
                        "2Acme,2,20\n" +
                        "3Lorem,3,40\n" +
                        "4Ipsum,4,210\n" +
                        "5Dolor,10,730\n" +
                        "6SIT,30,1000\n" +
                        "7Amet,50,160\n" +
                        "8Acme,2,20\n" +
                        "9Lorem,3,40\n" +
                        "11Ipsum,4,210\n" +
                        "12Dolor,10,730\n" +
                        "13SIT,30,1000\n" +
                        "14Amet,50,160\n" +
                        "qAcme,2,20\n" +
                        "aLorem,3,40\n" +
                        "zIpsum,4,210\n" +
                        "xDolor,10,730\n" +
                        "cSIT,30,1000\n" +
                        "vAmet,50,160\n" +
                        "bAcme,2,20\n" +
                        "kLorem,3,40\n" +
                        "tIpsum,4,210\n" +
                        "dDolor,10,730\n" +
                        "fSIT,30,1000\n" +
                        "gAmet,50,160\n" +
                        "hAcme,2,20\n" +
                        "jLorem,3,40\n" +
                        "fIpsum,4,210\n" +
                        "wDolor,10,730\n" +
                        "qSIT,30,1000\n" +
                        "gAmet,50,160\n" +
                        "jAcme,2,20\n" +
                        "lLorem,3,40\n" +
                        "nIpsum,4,210\n" +
                        "cDolor,10,730\n" +
                        "cSIT,30,1000\n" +
                        "xAmet,50,160\n" +
                        "vAcme,2,20\n" +
                        "bLorem,3,40\n" +
                        "kIpsum,4,210\n" +
                        "cDolor,10,730\n" +
                        "vSIT,30,1000\n" +
                        "rAmet,50,160\n" +
                        "wAcme,2,20\n" +
                        "pfwLorem,3,40\n" +
                        "wpIpsum,4,210\n" +
                        "wpDolor,10,730\n" +
                        "wpSIT,30,1000\n" +
                        "wpAmet,50,160\n" +
                        "fMauris,100,100"));
        } catch (IOException e) {
            //ignore
        }
        return null;
    }

    public static Input dataSet2() {
        try {
            return deserialize(
                new StringReader(
                    "2000000000\n" +
                        "Acme,1000000,5000\n" +
                        "Lorem,2000000,9000\n" +
                        "Ipsum,3000000,20000"));
        } catch (IOException e) {
            //ignore
        }
        return null;
    }

    public static Input dataSet3() {
        try {
            return deserialize(
                new StringReader(
                    "50000000\n" +
                        "Acme,1,0\n" +
                        "Lorem,2,2\n" +
                        "Ipsum,3,2\n" +
                        "Dolor,70000,71000\n" +
                        "Mauris,49000000,50000000\n"));
        } catch (IOException e) {
            //ignore
        }
        return null;
    }

    public static Input incorrectDataSet() {
        try {
            return deserialize(
                new StringReader(
                    "0\n" +
                        "Acme,-1,-1\n" +
                        "Lorem,-1,9000\n" +
                        "Ipsum,3000000,-1"));
        } catch (IOException e) {
            //ignore
        }
        return null;
    }

    public static Input emptyDataset() {
        try {
            return deserialize(
                new StringReader("0\n"));
        } catch (IOException e) {
            //ignore
        }
        return null;
    }

    public static Output dummyOutputFromInput(Input input) {
        List<OutputItem> outputItem = input.getCompanies().stream().map(company -> new OutputItem(company.getName(), 0, 0, 0)).collect(
            Collectors.toList());
        OutputMetadata outputMetadata = new OutputMetadata(input.getAvailableImpressions(), 0);
        return new Output(outputItem, outputMetadata);
    }

}
