package com.all;

import org.w3c.dom.Entity;

import java.util.*;

public class SearchInGraf {
    public static void main(String[] args) {

    }

    public static void search(int[][] graff, int startNode) {
        int numNodes = graff.length;

        boolean[] visit = new boolean[numNodes];
        Queue<Integer> queue = new LinkedList<>();

        visit[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            for (int i= 0; i < numNodes; i++ ) {

                if (!visit[i] && graff[currentNode][i] > 0){
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }

    }
}
