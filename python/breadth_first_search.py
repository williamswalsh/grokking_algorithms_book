from collections import deque

def search(name):
    # Construct double ended queue deque(Pronounced like cheque)
    search_queue = deque()

    search_queue += graph[name]
    
    # Need this to avoid infinite loops relating to 2 way relationships A -> B, B -> A 
    searched = []

    while search_queue:
        person = search_queue.popleft()

        if person not in searched:
            if person_is_seller(person):
                print(person + " is a Java specialist.")
                return True
            else:
                search_queue += graph[person]
                searched.append(person)
    return False


# predicate method to discriminate the target node from another.
# In real use cases this would be different(depends on requirement).
def person_is_seller(name):
    return name[-1] == "m"

if __name__ == "__main__":
    graph = {}
    graph["you"] = ["alice", "bob", "claire"]
    graph["alice"] = ["peggy"]
    graph["bob"] = ["anuj", "peggy"]
    graph["claire"] = ["thom", "jonny"]
    graph["anuj"] = []
    graph["peggy"] = []
    graph["thom"] = []
    graph["jonny"] = []

    # Search starting from the "you" node in the graph
    # Search radiates out from this node.
    search("you")

