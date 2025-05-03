 internal class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split();
            while (input[0] != "0")
            {
                long[] heights = new long[input.Length - 1];
                for (int i = 0; i < heights.Length; i++)
                {
                    heights[i] = long.Parse(input[i + 1]);
                }
                Console.WriteLine(LargestRectangleArea(heights));
                input = Console.ReadLine().Split();
            }     
        }

        static long LargestRectangleArea(long[] heights)
        {
            Stack<long> stack = new Stack<long>(); //막대의 인덱스를 저장
            long maxArea = 0;
            long index = 0;

            while(index < heights.Length) 
            {
                //높이가 같거나 큰 경우
                if(stack.Count == 0 ||
                    heights[index] >= heights[stack.Peek()])
                {
                    stack.Push(index);
                    index++;
                }
                //높이가 작은 경우
                else
                {
                    long top = stack.Pop();
                    //왼쪽 경계가 있다면 너비는 index
                    //왼쪽 경계가 있으면 (현재 인덱스 - 스택 top - 1)
                    long width = stack.Count == 0 ? index : index - stack.Peek() - 1;
                    long area = heights[top] * width;
                    if(area > maxArea)
                    {
                        maxArea = area;
                    }
                }
            }

            //나머지 막대들도 계산
            while(stack.Count > 0)
            {
                long top = stack.Pop();
                long width = stack.Count == 0 ? index : index - stack.Peek() - 1;
                long area = heights[top] * width;
                if (area > maxArea)
                {
                    maxArea = area;
                }
            }


            return maxArea;
        }
    }