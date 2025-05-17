package org.lenny.solid.principles.isp;

public class SmartDoorLock implements Lockable {
    private boolean isLocked = false;

    @Override
    public void lock() {
        isLocked = true;
        System.out.println("Door is now LOCKED.");
    }

    @Override
    public void unlock() {
        isLocked = false;
        System.out.println("Door is now UNLOCKED.");
    }
}
