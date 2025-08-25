package org.gluu.agama.smtp;

import java.util.Map;

class EmailUpdateTemplateAr {

    static Map<String, String> get() {

        String html = """
<table role="presentation" cellspacing="0" cellpadding="0" width="100%" style="background-color:#F2F4F6;margin:0;padding:0;width:100%;direction:rtl;text-align:right;">
  <tbody>
    <tr>
      <td align="center">
        <table role="presentation" cellspacing="0" cellpadding="0" width="100%" style="margin:0;padding:0;">
          <tbody>
            <!-- Logo -->
            <tr>
              <td align="center" style="padding:25px 0;text-align:center;">
                <img src="https://storage.googleapis.com/email_template_staticfiles/Phi_logo320x132_Aug2024.png" width="160" alt="Phi Logo" style="border:none;">
              </td>
            </tr>

            <!-- Main Email Body -->
            <tr>
              <td style="width:100%;margin:0;padding:0;">
                <table role="presentation" cellspacing="0" cellpadding="0" width="570" align="center" style="background-color:#FFFFFF;margin:0 auto;padding:0;border-radius:4px;direction:rtl;text-align:right;">
                  <tbody>
                    <tr>
                      <td style="padding:45px;font-family:'Nunito Sans',Helvetica,Arial,sans-serif;color:#51545E;font-size:16px;line-height:1.8;direction:rtl;text-align:right;">

                        <p>ÙØ±Ø­Ø¨Ø§ÙØ</p>
                        <p>ØªÙ ØªØ­Ø¯ÙØ« Ø¹ÙÙØ§Ù Ø¨Ø±ÙØ¯Ù Ø§ÙØ¥ÙÙØªØ±ÙÙÙ Ø¨ÙØ¬Ø§Ø­. ÙÙÙÙÙ Ø§ÙØ¢Ù ÙÙØ§ØµÙØ© Ø§Ø³ØªØ®Ø¯Ø§Ù Ø§ÙØªØ·Ø¨ÙÙ ÙØ§ÙØ§Ø³ØªÙØªØ§Ø¹ Ø¨Ø®Ø¯ÙØ§ØªÙØ§ Ø¯ÙÙ Ø£Ù Ø§ÙÙØ·Ø§Ø¹.</p>
                        <p><a href="https://link.phiwallet.com/vLl3yLHkeQb" style="color:#3869D4;font-weight:bold;">ÙØªØ­ Ø§ÙØªØ·Ø¨ÙÙ</a></p>
                        <p>Ø¥Ø°Ø§ ÙÙØª Ø¨Ø­Ø§Ø¬Ø© Ø¥ÙÙ Ø§ÙÙØ³Ø§Ø¹Ø¯Ø©Ø ÙØ§ Ø¹ÙÙÙ Ø³ÙÙ Ø§ÙØ±Ø¯ Ø¹ÙÙ ÙØ°Ø§ Ø§ÙØ¨Ø±ÙØ¯ ÙÙØªÙØ§ØµÙ ÙØ¹ ÙØ±ÙÙ Ø§ÙØ¯Ø¹Ù.</p>
                        <p style="margin-top:30px;">ÙØ¹ Ø®Ø§ÙØµ Ø§ÙØªØ­ÙØ©Ø<br>ÙØ±ÙÙ Phi Wallet</p>

                      </td>
                    </tr>
                  </tbody>
                </table>
              </td>
            </tr>

            <!-- Footer -->
            <tr>
              <td>
                <table role="presentation" cellspacing="0" cellpadding="0" width="570" align="center" style="margin:0 auto;padding:0;text-align:center;direction:rtl;">
                  <tbody>
                    <tr>
                      <td style="padding:20px;font-size:12px;color:#666;direction:rtl;text-align:center;">
                        <p style="margin:0 0 10px 0;font-size:14px;font-weight:bold;color:#565555;">ØªØ§Ø¨Ø¹ÙØ§ Ø¹ÙÙ:</p>
                        <p>
                          <a href="https://www.facebook.com/PhiWallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/facebook.png" style="height:20px;"></a>
                          <a href="https://x.com/PhiWallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/twitter.png" style="height:20px;"></a>
                          <a href="https://www.instagram.com/phi.wallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/instagram.png" style="height:20px;"></a>
                          <a href="https://www.linkedin.com/company/phiwallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/linkedin.png" style="height:20px;"></a>
                        </p>
                        <p style="margin-top:10px;line-height:20px;color:#A8AAAF;font-size:12px;">
                          Phi Wallet Unipessoal LDA<br>
                          Avenida da Liberdade 262 R/C<br>
                          1250-149 ÙØ´Ø¨ÙÙØ©<br>
                          Ø§ÙØ¨Ø±ØªØºØ§Ù
                        </p>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </td>
            </tr>

          </tbody>
        </table>
      </td>
    </tr>
  </tbody>
</table>
""";

        return Map.of(
            "subject", "ØªÙ ØªØ­Ø¯ÙØ« Ø¹ÙÙØ§Ù Ø¨Ø±ÙØ¯Ù Ø§ÙØ¥ÙÙØªØ±ÙÙÙ",
            "body", html
        );
    }
}
