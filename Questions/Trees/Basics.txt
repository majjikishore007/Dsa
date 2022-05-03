class Node:
    # constructure
    def __init__(self, key):
        self.data = key
        self.left = None
        self.right = None

# curr , left , right


def pre_order(root):
    if root:
        print(root.data, end=" ")
        pre_order(root.left)
        pre_order(root.right)

# left ,curr ,right


def in_order(root):
    if root:
        in_order(root.left)
        print(root.data, end=" ")
        in_order(root.right)

# left ,right ,curr


def post_order(root):
    if root:
        post_order(root.left)
        post_order(root.right)
        print(root.data, end=" ")

# this is level wise traversal


def level_order(root):
    if root is None:
        return

    #creating a queue for storing all the elements
    que = []

    que.add(root)

    while(len(que) > 0):

        print(que[0].data)
        node = que.pop(0)

        #pushing the left element
        if node.left is not None:
            que.append(node.left)

        #pushing the right element
        if node.right is not None:
            que.append(node.right)


root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)


print(pre_order(root))
