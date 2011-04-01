package com.indextank;

import java.io.IOException;

import com.flaptor.indextank.apiclient.IndexDoesNotExistException;
import com.flaptor.indextank.apiclient.IndexTankClient;
import com.flaptor.indextank.apiclient.IndexTankClient.Index;

public class IndexTankClientDemo {
  
  public static void main(String[] args) throws IOException, IndexDoesNotExistException {
    IndexTankClient client = new IndexTankClient("<public-api>","<auth-info>");
    for(Index index: client.listIndexes()) {
      System.out.println(index.getCode());
    }
  }

}
