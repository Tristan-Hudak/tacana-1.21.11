package dev.hudak.tacana.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TacanaLeavesBlocks extends LeavesBlock {

    public static final MapCodec<TacanaLeavesBlocks> CODEC =
            BlockBehaviour.simpleCodec(TacanaLeavesBlocks::new);

    public TacanaLeavesBlocks(float fallingLeavesChance, BlockBehaviour.Properties properties){
        super(fallingLeavesChance, properties);
    }

    @Override
    public MapCodec<? extends LeavesBlock> codec() {
        return CODEC;
    }

    @Override
    protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {

    }

}
