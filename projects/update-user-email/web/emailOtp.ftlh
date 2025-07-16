[#ftl output_format="HTML"]
<!DOCTYPE html>
<html lang="en">
<head><meta charset="UTF-8"><meta http-equiv="X-UA-Compatible" content="IE=edge"><meta name="viewport" content="width=device-width, initial-scale=1.0"><title>OTP Verification
	</title><link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2/dist/tailwind.min.css" type="text/css"></head>
<body>

  
	
	
	
	
	
  
  
	<div class="min-h-screen flex flex-col justify-center items-center bg-white">
	  <div class="bg-white border border-gray-300 rounded shadow-md p-10">
		<div class="flex flex-col items-center space-y-4">
		  <img src="https://gluu.org/wp-content/uploads/2020/12/logo.png" alt="Logo" class="h-12">
		  <h2 class="text-2xl font-semibold text-gray-700">OTP Verification
		  </h2>
		  <p class="text-gray-600">A verification code has been sent to:
		  </p>
		  <!-- ✅ Show email value from backend -->
		  <p class="text-green-600 font-semibold text-lg">${email}
		  </p>
		  <!-- Main OTP form -->
		  <form method="post" class="w-full mt-6">
			<!-- ✅ Show error messages from backend -->
			&lt;#if errorMessage?? &amp;&amp; errorMessage?length gt 0&gt;
			  <div class="text-red-500 text-sm font-medium mb-2">${errorMessage}</div>
			<!--#if-->

			&lt;#if matches?? &amp;&amp; !matches&gt;
			  <div class="text-red-500 text-sm font-medium mb-2">Invalid OTP. Please try again.</div>
			<!--#if-->
			<!--#if-->
			<label for="passcode" class="block text-gray-600 text-sm mb-2">Enter OTP</label>
			<input type="text" id="passcode" name="passcode" pattern="[0-9]+" placeholder="000000" required="" autofocus="" class="w-full border border-gray-300 rounded px-3 py-2 focus:outline-none focus:ring-2 focus:ring-green-500">
			<button type="submit" class="mt-4 w-full bg-green-500 hover:bg-green-600 text-white py-2 rounded font-semibold">
			  Continue
			</button>
		  </form>
		  <!-- Resend option form -->
		  <form method="post" class="mt-4">
			<p class="text-sm text-gray-600">Didn't receive the code?
			</p>
			<!-- ✅ Use name=resent to match Agama flow -->
			<button type="submit" name="resent" value="true" class="text-green-500 font-semibold text-sm">
			  Resend Code
			</button>
		  </form>
		</div>
	  </div>
	</div>
  
</body>


</html>