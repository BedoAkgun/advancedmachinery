
package net.groupproject.advancedmachinery.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.groupproject.advancedmachinery.world.inventory.MixerGUIMenu;
import net.groupproject.advancedmachinery.network.MixerGUIButtonMessage;
import net.groupproject.advancedmachinery.AdvancedmachineryMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MixerGUIScreen extends AbstractContainerScreen<MixerGUIMenu> {
	private final static HashMap<String, Object> guistate = MixerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MixerGUIScreen(MixerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("advancedmachinery:textures/screens/mixer_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Item Mixer", 61, 3, -16777216);
		this.font.draw(poseStack, "Gem", 17, 74, -12829636);
		this.font.draw(poseStack, "Scrap", 13, 7, -12829636);
		this.font.draw(poseStack, "Output", 136, 22, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 69, this.topPos + 35, 40, 20, Component.literal("Mix"), e -> {
			if (true) {
				AdvancedmachineryMod.PACKET_HANDLER.sendToServer(new MixerGUIButtonMessage(0, x, y, z));
				MixerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
