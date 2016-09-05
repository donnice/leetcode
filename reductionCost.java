static int reductionCost(int[] num) {
	
	if(num == null || num.length == 0) return -1;
	// initialize variables
	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	int total = 0;
	// add to queue
	for(int i = 0; i < num.length; i++){
		queue.add(num[i]);
	}
	
	while(queue.size() > 1)
	{
		int num1 = queue.poll();
		int num2 = queue.poll();
		total += (num1+num2);
		queue.add(num1+num2);
	}
	return total;
}