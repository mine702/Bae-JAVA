# [unrated] 이모티콘 할인행사 - 150368 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/150368?language=java#) 

### 성능 요약

메모리: 77.8 MB, 시간: 0.06 ms

### 구분

코딩테스트 연습 > 2023 KAKAO BLIND RECRUITMENT

### 채점결과

Empty

### 문제 설명

<p style="user-select: auto;">카카오톡에서는 이모티콘을 무제한으로 사용할 수 있는 이모티콘 플러스 서비스 가입자 수를 늘리려고 합니다.<br style="user-select: auto;">
이를 위해 카카오톡에서는 이모티콘 할인 행사를 하는데, 목표는 다음과 같습니다.</p>

<ol style="user-select: auto;">
<li style="user-select: auto;">이모티콘 플러스 서비스 가입자를 최대한 늘리는 것.</li>
<li style="user-select: auto;">이모티콘 판매액을 최대한 늘리는 것.</li>
</ol>

<p style="user-select: auto;"><strong style="user-select: auto;"><u style="user-select: auto;">1번 목표가 우선이며, 2번 목표가 그 다음입니다.</u></strong></p>

<p style="user-select: auto;">이모티콘 할인 행사는 다음과 같은 방식으로 진행됩니다.</p>

<ul style="user-select: auto;">
<li style="user-select: auto;"><code style="user-select: auto;">n</code>명의 카카오톡 사용자들에게 이모티콘 <code style="user-select: auto;">m</code>개를 할인하여 판매합니다.</li>
<li style="user-select: auto;">이모티콘마다 할인율은 다를 수 있으며, 할인율은 10%, 20%, 30%, 40% 중 하나로 설정됩니다.</li>
</ul>

<p style="user-select: auto;">카카오톡 사용자들은 다음과 같은 기준을 따라 이모티콘을 사거나, 이모티콘 플러스 서비스에 가입합니다.</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">각 사용자들은 자신의 기준에 따라 일정 비율 이상 할인하는 이모티콘을 모두 구매합니다.</li>
<li style="user-select: auto;">각 사용자들은 자신의 기준에 따라 이모티콘 구매 비용의 합이 일정 가격 이상이 된다면, 이모티콘 구매를 모두 취소하고 이모티콘 플러스 서비스에 가입합니다.</li>
</ul>

<p style="user-select: auto;">다음은 2명의 카카오톡 사용자와 2개의 이모티콘이 있을때의 예시입니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">사용자</th>
<th style="user-select: auto;">비율</th>
<th style="user-select: auto;">가격</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">40</td>
<td style="user-select: auto;">10,000</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">25</td>
<td style="user-select: auto;">10,000</td>
</tr>
</tbody>
      </table><table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">이모티콘</th>
<th style="user-select: auto;">가격</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">7,000</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">9,000</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">1번 사용자는 40%이상 할인하는 이모티콘을 모두 구매하고, 이모티콘 구매 비용이 10,000원 이상이 되면 이모티콘 구매를 모두 취소하고 이모티콘 플러스 서비스에 가입합니다.<br style="user-select: auto;">
2번 사용자는 25%이상 할인하는 이모티콘을 모두 구매하고, 이모티콘 구매 비용이 10,000원 이상이 되면 이모티콘 구매를 모두 취소하고 이모티콘 플러스 서비스에 가입합니다.</p>

<p style="user-select: auto;">1번 이모티콘의 가격은 7,000원, 2번 이모티콘의 가격은 9,000원입니다.</p>

<p style="user-select: auto;">만약, 2개의 이모티콘을 모두 40%씩 할인한다면, 1번 사용자와 2번 사용자 모두 1,2번 이모티콘을 구매하게 되고, 결과는 다음과 같습니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">사용자</th>
<th style="user-select: auto;">구매한 이모티콘</th>
<th style="user-select: auto;">이모티콘 구매 비용</th>
<th style="user-select: auto;">이모티콘 플러스 서비스 가입 여부</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">1, 2</td>
<td style="user-select: auto;">9,600</td>
<td style="user-select: auto;">X</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">1, 2</td>
<td style="user-select: auto;">9,600</td>
<td style="user-select: auto;">X</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">이모티콘 플러스 서비스 가입자는 0명이 늘어나고 이모티콘 판매액은 19,200원이 늘어납니다.</p>

<p style="user-select: auto;">하지만, 1번 이모티콘을 30% 할인하고 2번 이모티콘을 40% 할인한다면 결과는 다음과 같습니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">사용자</th>
<th style="user-select: auto;">구매한 이모티콘</th>
<th style="user-select: auto;">이모티콘 구매 비용</th>
<th style="user-select: auto;">이모티콘 플러스 서비스 가입 여부</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">5,400</td>
<td style="user-select: auto;">X</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">1, 2</td>
<td style="user-select: auto;">10,300</td>
<td style="user-select: auto;">O</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">2번 사용자는 이모티콘 구매 비용을 10,000원 이상 사용하여 이모티콘 구매를 모두 취소하고 이모티콘 플러스 서비스에 가입하게 됩니다.<br style="user-select: auto;">
따라서, 이모티콘 플러스 서비스 가입자는 1명이 늘어나고 이모티콘 판매액은 5,400원이 늘어나게 됩니다.</p>

<p style="user-select: auto;">카카오톡 사용자 <code style="user-select: auto;">n</code>명의 구매 기준을 담은 2차원 정수 배열 <code style="user-select: auto;">users</code>, 이모티콘 <code style="user-select: auto;">m</code>개의 정가를 담은 1차원 정수 배열 <code style="user-select: auto;">emoticons</code>가 주어집니다. 이때, 행사 목적을 최대한으로 달성했을 때의 이모티콘 플러스 서비스 가입 수와 이모티콘 매출액을 1차원 정수 배열에 담아 return 하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">users</code>의 길이 = <code style="user-select: auto;">n</code> ≤ 100

<ul style="user-select: auto;">
<li style="user-select: auto;"><code style="user-select: auto;">users</code>의 원소는 [<code style="user-select: auto;">비율</code>, <code style="user-select: auto;">가격</code>]의 형태입니다.</li>
<li style="user-select: auto;"><code style="user-select: auto;">users[i]</code>는 <code style="user-select: auto;">i+1</code>번 고객의 구매 기준을 의미합니다.</li>
<li style="user-select: auto;"><code style="user-select: auto;">비율</code>% 이상의 할인이 있는 이모티콘을 모두 구매한다는 의미입니다.

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">비율</code> ≤ 40</li>
</ul></li>
<li style="user-select: auto;"><code style="user-select: auto;">가격</code>이상의 돈을 이모티콘 구매에 사용한다면, 이모티콘 구매를 모두 취소하고 이모티콘 플러스 서비스에 가입한다는 의미입니다.

<ul style="user-select: auto;">
<li style="user-select: auto;">100 ≤ <code style="user-select: auto;">가격</code> ≤ 1,000,000</li>
<li style="user-select: auto;"><code style="user-select: auto;">가격</code>은 100의 배수입니다.</li>
</ul></li>
</ul></li>
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">emoticons</code>의 길이 = <code style="user-select: auto;">m</code> ≤ 7

<ul style="user-select: auto;">
<li style="user-select: auto;"><code style="user-select: auto;">emoticons[i]</code>는 <code style="user-select: auto;">i+1</code>번 이모티콘의 정가를 의미합니다.</li>
<li style="user-select: auto;">100 ≤ <code style="user-select: auto;">emoticons</code>의 원소 ≤ 1,000,000</li>
<li style="user-select: auto;"><code style="user-select: auto;">emoticons</code>의 원소는 100의 배수입니다.</li>
</ul></li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">users</th>
<th style="user-select: auto;">emoticons</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">[[40, 10000], [25, 10000]]</td>
<td style="user-select: auto;">[7000, 9000]</td>
<td style="user-select: auto;">[1, 5400]</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">[[40, 2900], [23, 10000], [11, 5200], [5, 5900], [40, 3100], [27, 9200], [32, 6900]]</td>
<td style="user-select: auto;">[1300, 1500, 1600, 4900]</td>
<td style="user-select: auto;">[4, 13860]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;"><strong style="user-select: auto;">입출력 예 #1</strong></p>

<p style="user-select: auto;">문제의 예시와 같습니다.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">입출력 예 #2</strong></p>

<p style="user-select: auto;">다음과 같이 할인하는 것이 이모티콘 플러스 서비스 가입자를 최대한 늘리면서, 이모티콘 판매액 또한 최대로 늘리는 방법입니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">이모티콘</th>
<th style="user-select: auto;">할인율</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">40</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">40</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">20</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">4</td>
<td style="user-select: auto;">40</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">위와 같이 할인하면 4명의 이모티콘 플러스 가입자와 13,860원의 판매액을 달성할 수 있습니다. 다른 할인율을 적용하여 이모티콘을 판매할 수 있지만 이보다 이모티콘 플러스 서비스 가입자를 최대한 늘리면서, 이모티콘 판매액 또한 최대로 늘리는 방법은 없습니다.<br style="user-select: auto;">
따라서, [4, 13860]을 return 하면 됩니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges