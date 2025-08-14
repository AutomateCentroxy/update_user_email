package org.gluu.agama.smtp;

import java.util.Map;

class EmailTemplateEs {

    static Map<String, String> get(String otp) {

        String html = """
<table role="presentation" cellspacing="0" cellpadding="0" width="100%" style="background-color:#F2F4F6;margin:0;padding:0;width:100%;">
  <tbody>
    <tr>
      <td align="center">
        <table role="presentation" cellspacing="0" cellpadding="0" width="100%" style="margin:0;padding:0;">
          <tbody>
            <!-- Logo -->
            <tr>
              <td align="center" style="padding:25px 0;text-align:center;">
                <img src="https://storage.googleapis.com/email_template_staticfiles/Phi_logo320x132_Aug2024.png" width="160" alt="Logo Phi" style="border:none;">
              </td>
            </tr>

            <!-- Main Email Body -->
            <tr>
              <td style="width:100%;margin:0;padding:0;">
                <table role="presentation" cellspacing="0" cellpadding="0" width="570" align="center" style="background-color:#FFFFFF;margin:0 auto;padding:0;border-radius:4px;">
                  <tbody>
                    <tr>
                      <td style="padding:45px;font-family:'Nunito Sans',Helvetica,Arial,sans-serif;color:#51545E;font-size:16px;line-height:1.625;">
                        <p>Hola,</p>
                        
                        <p>Introduce el cÃ³digo de 6 dÃ­gitos a continuaciÃ³n para verificar tu direcciÃ³n de correo electrÃ³nico.</p>

                        <div style="text-align:center;margin:30px 0;">
                          <div style="display:inline-block;background-color:#b6f6da;color:#0ca65d;font-size:40px;font-weight:600;letter-spacing:6px;padding:10px 20px;border-radius:4px;">
                            """ + otp + """
                          </div>
                        </div>

                        <p>Si no realizaste esta solicitud, puedes ignorar este correo de forma segura.</p>
                        <p>Gracias por ayudarnos a mantener tu cuenta segura.</p>

                        <p style="margin-top:30px;">Equipo Phi Wallet</p>

                      </td>
                    </tr>
                  </tbody>
                </table>
              </td>
            </tr>

            <!-- Footer -->
            <tr>
              <td>
                <table role="presentation" cellspacing="0" cellpadding="0" width="570" align="center" style="margin:0 auto;padding:0;text-align:center;">
                  <tbody>
                    <tr>
                      <td style="padding:20px;font-size:12px;color:#666;">
                        <p style="margin:0 0 10px 0;font-size:14px;font-weight:bold;color:#565555;">SÃ­guenos en:</p>
                        <p>
                          <a href="https://www.facebook.com/PhiWallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/facebook.png" style="height:20px;"></a>
                          <a href="https://x.com/PhiWallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/twitter.png" style="height:20px;"></a>
                          <a href="https://www.instagram.com/phi.wallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/instagram.png" style="height:20px;"></a>
                          <a href="https://www.linkedin.com/company/phiwallet" style="margin:0 5px;"><img src="https://storage.googleapis.com/mwapp_prod_bucket/social_icon_images/linkedin.png" style="height:20px;"></a>
                        </p>
                        <p style="margin-top:10px;line-height:20px;color:#A8AAAF;font-size:12px;">
                          Phi Wallet Unipessoal LDA<br>
                          Avenida da Liberdade 262 R/C<br>
                          1250-149 Lisboa<br>
                          Portugal
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
            "subject", "Tu cÃ³digo de verificaciÃ³n",
            "body", html
        );
    }
}
