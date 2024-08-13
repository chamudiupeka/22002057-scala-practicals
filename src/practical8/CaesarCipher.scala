package practical8

object CaesarCipher {


  def encrypt(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val base = if (char.isLower) 'a' else 'A'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }


  def decrypt(ciphertext: String, shift: Int): String = {
    encrypt(ciphertext, 26 - shift)
  }


  def cipher(text: String, shift: Int, algo: (String, Int) => String): String = {
    algo(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Functional Programming"
    val shift = 3




    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encryptedText")


    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted: $decryptedText")
  }
}