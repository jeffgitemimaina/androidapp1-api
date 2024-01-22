package mysql.androidapp1.Entities

import jakarta.persistence.*


@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0,

        @Column
        val firstName: String,
        @Column
        val secondName: String,
       // @Column
   //     @Lob
    //    val imageData: ByteArray? = null,
        @Column
        val passWord: String,

        @Column
        val status : Boolean

)

//) {
//        override fun equals(other: Any?): Boolean {
//                if (this === other) return true
//                if (javaClass != other?.javaClass) return false
//
//                other as User
//
//                if (imageData != null) {
//                        if (other.imageData == null) return false
//                        if (!imageData.contentEquals(other.imageData)) return false
//                } else if (other.imageData != null) return false
//
//                return true
//        }
//
//        override fun hashCode(): Int {
//                return imageData?.contentHashCode() ?: 0
//        }
//}
