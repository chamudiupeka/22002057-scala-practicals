package practical8

object CaesarCipher {

  // Function to encrypt the plaintext using Caesar cipher
  def encrypt(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val base = if (char.isLower) 'a' else 'A'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char // Non-letter characters are not encrypted
      }
    }
  }

  // Function to decrypt the ciphertext using Caesar cipher
  def decrypt(ciphertext: String, shift: Int): String = {
    encrypt(ciphertext, 26 - shift) // Decryption is just encryption with 26 - shift
  }

  // General cipher function which takes an encryption or decryption function
  def cipher(text: String, shift: Int, algo: (String, Int) => String): String = {
    algo(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Functional Programming"
    val shift = 3



    // Encrypt the plaintext
    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encryptedText")

    // Decrypt the ciphertext
    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted: $decryptedText")
  }
}