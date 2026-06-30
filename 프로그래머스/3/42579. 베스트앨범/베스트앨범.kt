class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        val genreTotalMap = mutableMapOf<String, Int>()
        val genreSongsMap = mutableMapOf<String, MutableList<Song>>()

        for (i in genres.indices) {
            val genre = genres[i]
            val play = plays[i]

            genreTotalMap[genre] = genreTotalMap.getOrDefault(genre, 0) + play

            genreSongsMap.getOrPut(genre) { mutableListOf() }
                .add(Song(index = i, play = play))
        }

        val answer = mutableListOf<Int>()

        genreTotalMap
            .toList()
            .sortedByDescending { it.second }
            .forEach { (genre, _) ->
                genreSongsMap[genre]!!
                    .sortedWith(
                        compareByDescending<Song> { it.play }
                            .thenBy { it.index }
                    )
                    .take(2)
                    .forEach { song ->
                        answer.add(song.index)
                    }
            }

        return answer.toIntArray()
    }
    data class Song(
        val index: Int,
        val play: Int
    )
}