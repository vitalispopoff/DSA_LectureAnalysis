package part_06.chap_04_traversal;

public abstract class QueueTraversal implements Structured {

    TraverseQueue
        queue;

//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\

    private class TraverseQueue {

        TraverseQueue
                head,
                tail;
        Structured
                node;

//  constructor //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\

        TraverseQueue(Structured node) {
            this.node = node;
        }

        TraverseQueue(){}

//  methods     //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\

        Structured removeFromQueue() {
            TraverseQueue
                    cache = head;

            head = cache.tail;
            head.head = cache.tail = null;

            return cache.node;
        }

        void addToQueue(Structured node) {
            TraverseQueue
                    queuer = new TraverseQueue(node);
            if (head == tail) {
                if (tail == null)
                    setFirstQueuer(queuer);

                else {
                    this.tail.tail = queuer;
                    queuer.head = this;
                }
            }
        }

        private void setFirstQueuer(TraverseQueue queuer) {
            this.head = this.tail = queuer;
        }
    }
}
