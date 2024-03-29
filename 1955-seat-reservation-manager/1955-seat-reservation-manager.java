class SeatManager {
    private PriorityQueue<Integer> seats;
    int smallestAvailableSeat = 1;
    public SeatManager(int n) {
        seats = new PriorityQueue<>();
    }
    
    public int reserve() {
        if(!seats.isEmpty()){
            return seats.poll();
        }
        return smallestAvailableSeat++;
    }
    
    public void unreserve(int seatNumber) {
        seats.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */