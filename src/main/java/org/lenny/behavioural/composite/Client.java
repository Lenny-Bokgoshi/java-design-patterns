package org.lenny.behavioural.composite;


/**
 * Composes objects into tree structures to represent part-whole hierarchies,
 *  allowing clients to treat individual objects and groups uniformly.
 *
 *  Examples:
 *      Menu System – Represents menus and submenus as a tree where each item (or group) can be treated the same.
 *      Organization Hierarchy – Models employees and departments so both individuals and
 *          groups can be processed similarly (e.g., calculating total salaries).
 *      File System Representation – Treats files and folders as part of a unified structure for operations
 *          like traversal or size calculation.
 *      Workflow Engine – Represents tasks and nested sub-tasks uniformly to build complex workflows.
 *      UI Components – Builds user interfaces with containers (e.g., panels) and elements (e.g., buttons, labels)
 *              that follow the same structure and behavior.
 * **/
public class Client {
    public static void main(String[] args) {
        Composite computer = new Composite("PC");
        Equipment processor = new Equipment("Processor", 1000);
        Equipment hdd = new Equipment("Hard drive", 250);
        Composite memory = new Composite("Memory");
        Equipment rom = new Equipment("Read only memory", 75);
        Equipment ram = new Equipment("Random access memory", 100);

        memory.add(rom).add(ram);
        computer.add(processor).add(hdd).add(memory);

        System.out.println("PC price: " + computer.getPrice());
    }
}
