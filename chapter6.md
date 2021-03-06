# Chapter 6

## Dynamic Programming(동적 계획법)

### Dynamic Programming = Planning

이전 값을 이용해서 다음 값을 계산한다

## Exhaustive Search(완전탐색) = Brute force search

- 가능한 경우를 모두 구해서 문제의 해결 방법을 찾는 것이다
- 실행시간이 너무 길어 제한 시간 내에 문제를 해결할 수 없는 경우가 많다
- Brute force search
  - N중 반복문을 이용하는 방법
  
  - 재귀 호출을 이용하는 방법

- 완전 탐색 레시피
1. 가능한 모든 답의 후보를 만드는 과정을 여러 개의 선택으로 나눈다<br>(
    각 선택은 답의 후보를 만드는 과정의 한 조각이 된다
)
2. 그 중 하나의 조각을 선택해 답의 일부를 만들고 나머지 답을 재귀 호출을 통해 완성한다
3. 조각이 하나밖에 남지 않는 경우 혹은 하나도 남지 않는 경우에는 답을 생성했으므로 이것을 기저 사례로 선택해 처리한다<br>
즉 if문을 통해서 처리한다
## Back tracking

주어진 답이 나올 때 까지 검색하다가 중간에 확실히 이 방향이 아니면 다시 이전 상태로 돌아가서 경로를 찾아보는 방법
